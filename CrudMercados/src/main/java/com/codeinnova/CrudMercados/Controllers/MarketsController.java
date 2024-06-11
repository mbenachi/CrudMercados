package com.codeinnova.CrudMercados.Controllers;

import com.codeinnova.CrudMercados.Entities.MarketLocation;
import com.codeinnova.CrudMercados.Entities.MarketProducts;
import com.codeinnova.CrudMercados.Entities.Market;
import com.codeinnova.CrudMercados.Repository.MarketsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.util.Pair;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

@RestController
public class MarketsController {

    private final Logger log = LoggerFactory.getLogger(MarketsController.class);

    private MarketsRepository marketsRepository; // Atributo
    private List<String> productsList;
    private MarketProducts marketProducts;
    private MarketLocation marketLocation;

    public MarketsController(MarketsRepository marketsRepository) {
        this.marketsRepository = marketsRepository;
    }


    //CRUD

    // Search all

    @GetMapping("/api/markets")
    public List<Market> findAll() {

        return marketsRepository.findAll();
    }
    // Search for ID

    @GetMapping("api/markets/{id}")
    public ResponseEntity<Market> findOneById(@PathVariable Long id) {
        Optional<Market> marketOptional = marketsRepository.findById(id); //El Optional es para incluir en la busqueda los ID existentes y los nulos
        // (if y else), si se pone un valor nulo arrojará un not found por el ResponseEntity
        if (marketOptional.isPresent())
            return ResponseEntity.ok(marketOptional.get());
        else
            return ResponseEntity.notFound().build();
    }



    // FILTRO 1

    @GetMapping("/api/markets/onlyCash")
    public List<Market> findOnlyCash() {
        List<Market> allMarkets = marketsRepository.findAll(); // Recupera todos los mercados y los almacena en la lista allMarkets.
        List<Market> onlyCash = allMarkets.stream() // "stream" (flujo) permite tomar los datos de allMarkets y realizar operaciones en ellos, como filtrarlos
                .filter(market -> market.isOnlyCash()) //  "filter" evalúa si un mercado es estacionario o no
                .collect(Collectors.toList()); //Si en el funto anterior hay stacionarios pasaran el filtro y se coleccionaran en una lista
        return onlyCash;

    }

    // *******************FILTRO 2***********************************

    @PostMapping("/api/markets/products")

    public ResponseEntity<List<Map<String, Object>>> searchProductMarket(@RequestBody List<String> searchedProducts) {
        // Validación de la entrada de los productos
        for (String searchedProduct : searchedProducts) {
            if (searchedProduct.isEmpty()) {
                return ResponseEntity.badRequest().build();
            }
            //Verificación de existencia de los productos ingresados

            String methodName = "is" + Character.toUpperCase(searchedProduct.charAt(0)) + searchedProduct.substring(1);
            try {
                MarketProducts.class.getMethod(methodName);
            } catch (NoSuchMethodException e) {
                return ResponseEntity.badRequest().build();
            }
        }

        // Lista de pares (mercado, conteo de productos encontrados, productos disponibles)
        List<Pair<Market, Pair<Integer, List<String>>>> marketProductCountList = new ArrayList<>();

        // Contar los productos en cada mercado
        for (Market market : marketsRepository.findAll()) {
            int productCount = 0; //Se inicia un contador para cada mercado
            List<String> availableProducts = new ArrayList<>(); // Lista para almacenar los productos disponibles
            for (String searchProduct : searchedProducts) {
                String methodName = "is" + Character.toUpperCase(searchProduct.charAt(0)) + searchProduct.substring(1);
                try {
                    Method method = MarketProducts.class.getMethod(methodName); // Se llama dinámicamente a los métodos de MarketProducts
                    boolean result = (boolean) method.invoke(market.getProducts()); //Se invoca el método en la lista de productos del mercado actual
                    if (result) {
                        productCount++; //Si el metodo existe y devuelve true, se incrementa el contador
                        availableProducts.add(searchProduct); // Agregar producto disponible
                    }
                } catch (Exception e) { // Si hay error se ignora y continua
                }
            }
            if (productCount > 0) { //Si el contador es mayor a 0 se agrega el mercado y su contador a la lista de pares
                marketProductCountList.add(Pair.of(market, Pair.of(productCount, availableProducts)));
            }
        }

        // Ordenar la lista de mercados por el conteo de productos encontrados, de mayor a menor
        marketProductCountList.sort((p1, p2) -> p2.getSecond().getFirst().compareTo(p1.getSecond().getFirst()));

        // Lista de informacion de mercados encontrados
        List<Map<String, Object>> infoMarkets = new ArrayList<>();
        for (Pair<Market, Pair<Integer, List<String>>> pair : marketProductCountList) {
            Market market = pair.getFirst();
            List<String> products = pair.getSecond().getSecond(); //Se optienen los productos disponibles
            // Se crea un mapa para devolver una respuesta JSON (se usa LinkedHashMap para ordenar la respuesta, primeo id, luego name, luego los productos)
            Map<String, Object> marketInfo = new LinkedHashMap<>();
            marketInfo.put("id", market.getId());
            marketInfo.put("name", market.getName());
            marketInfo.put("availableProducts", products);

            infoMarkets.add(marketInfo);
        }
        // Verificar si se encontraron mercados
        if (infoMarkets.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        // Devolver lista de mercados encontrados
        return ResponseEntity.ok(infoMarkets);
    }


    // Create market in DB

    @PostMapping("/api/markets")
    public ResponseEntity<Market> create(@RequestBody Market market, @RequestHeader HttpHeaders headers){ //Cuerpo de la solicitud
        System.out.println(headers.get("User-Agent"));
        if(market.getId() != null){ //Verificar el ID para ver si ya existe y proceder a crearlo
            log.warn("Trying to create a market with id"); //Para que los errores se guarden en un archivo específico
            System.out.println("Trying to create a market with id");
            return ResponseEntity.badRequest().build();
        }
        Market result = marketsRepository.save(market);
        return ResponseEntity.ok(result);
    }

    // Update market in DB

    @PutMapping("/api/markets")
    public ResponseEntity<Market> update(@RequestBody Market market){ //Cuerpo de la solicitud
        if(market.getId() ==null){
            log.warn("Trying to update a non existent market");
            return ResponseEntity.badRequest().build();
        }
        if(!marketsRepository.existsById(market.getId())) { //Existia y ya no
            log.warn("Trying to update a non existent market");
            return ResponseEntity.notFound().build();
        }
        Market result = marketsRepository.save(market);
        return ResponseEntity.ok(result);

    }

    // Delete

    @DeleteMapping("/api/markets/{id}")
    public ResponseEntity<Market> delete(@PathVariable Long id){

        if(!marketsRepository.existsById(id)){
            log.warn("Trying to delete a non existent market");
            return ResponseEntity.notFound().build();
        }

        marketsRepository.deleteById(id);

        return ResponseEntity.noContent().build(); //Devuelve que el contenido ya no está disponible

    }

}

            //FILTRO CON "FIELD"
//    @PostMapping("/api/markets/products")
//    public ResponseEntity<List<Markets>> searchProductMarket(@RequestBody List<String> searchedProducts) {
//        for (String searchedProduct : searchedProducts) {
//            if (searchedProduct == null || searchedProduct.isEmpty()) { //Verificar que pertenezca a productos
//                return ResponseEntity.badRequest().build();
//            }
//        }
//        // Filtrado de mercados por productos
//        List<Markets> foundMarkets = new ArrayList<>(); //Lista vacía foundMarkets
//        for (Markets market : marketsRepository.findAll()) { //Se recorren todos los mercados guardados en el repositorio
//            boolean allProductsFound = true;
//            for (String searchProduct : searchedProducts) {
//                boolean foundProduct = false;
//                try {
//                    Field field = MarketProducts.class.getDeclaredField(searchProduct.toLowerCase());
//                    field.setAccessible(true); // setAccessible(true) es un método que permite acceder a campos privados o
//                                              // protegidos. Esto es necesario porque los campos en MarketProducts son
//                                             // privados y no se puede acceder a ellos directamente desde fuera de la clase.
//                    foundProduct = field.getBoolean(market.getProducts());
//                } catch (NoSuchFieldException | IllegalAccessException e) {
//                    allProductsFound = false;
//                    break;
//                }
//                if (!foundProduct) {
//                    allProductsFound = false;
//                    break; //Sale del bucle
//                }
//            }
//            if (allProductsFound) {
//                foundMarkets.add(market); //Si si se encuentran todos los productos en un mercado se añade el mercado a foundMarkets
//            }
//        }
//        return ResponseEntity.ok(foundMarkets);
//    }
