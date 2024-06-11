package com.codeinnova.CrudMercados;

import com.codeinnova.CrudMercados.Entities.*;
import com.codeinnova.CrudMercados.Repository.MarketsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalTime;



@SpringBootApplication
public class CrudMercadosApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CrudMercadosApplication.class, args);
		MarketsRepository repository = context.getBean(MarketsRepository.class);

		//Create markets

		//Market1

		Market market1 = new Market();
		
		market1.setName("Pedro Market");
		market1.setEstablishment(true);
		market1.setOnlyCash(false);
		market1.setLocation(new MarketLocation(1234L, 13243L, "Calle 5 #7-23"));
		market1.setOperatingHours(new MarketOperatingHours(
				true, LocalTime.of(07, 00), LocalTime.of(21, 00),
				true, LocalTime.of(07, 00), LocalTime.of(21, 00),
				true, LocalTime.of(07, 00), LocalTime.of(21, 00),
				true, LocalTime.of(07, 00), LocalTime.of(21, 00),
				true, LocalTime.of(07, 00), LocalTime.of(21, 00),
				false, null, null,
				true, LocalTime.of(06, 00), LocalTime.of(20, 30)));
		market1.setProducts(new MarketProducts(true, true, true, true, true,
				true, false, true, true, false, true, false,
				true, true, false, true, true, true, true,
				true, false, true, true, true, false, true,
				false, true, true, true, true, false, true,
				true, true, true, true, true, true, true, true,
				true, false, false, false, false, false, false,
				false, true, true, false, true, true, true, false,
				true, true, false, true, false, true,
				true, false, true, true, true, true, true,
				false, true, true, true, false, true, false, true,
				true, true, true, false, true, true, true, true,
				false, true, false, true, true, true,
				true, false, true, false));
		market1.setQualification(new MarketQualification(4.8F, "Good sugar"));
		market1.setContact(new MarketContact("pedro@gmail.com", 123456L));

		//Market2
		Market market2 = new Market();

		market2.setName("AZ Market");
		market2.setEstablishment(false);
		market2.setOnlyCash(true);
		market2.setLocation(new MarketLocation( 5678L, 987L, "Parqueadero del barrio Los Naranjos"));
		market2.setOperatingHours(new MarketOperatingHours(
				false, null, null,
				false, null, null,
				false, null, null,
				false, null, null,
				false, null, null,
				true, LocalTime.of(06, 00), LocalTime.of(14, 00),
				true, LocalTime.of(06, 00), LocalTime.of(14, 00)));
		market2.setProducts(new MarketProducts(false, false,false, true,true,
				true,false, true,true,false, true, false,
				true,true, false,true,true,true,true,
				true,false, true,true,true, false,true,
				false, true,true,true,true, false, true,
				true,true,true,true,true,true,true,true,
				true, false, false, false, false, false, false,
				false, true, true,false, true,true,true,false,
				true,true,false, true, false, true,
				true, false,true,true,true,true,true,
				false, true,true,true, false,true, false, true,
				true,true,true, false, true,true,true,true,
				false,true, false, true,true,true,
				true, false, true, false ));
		market2.setQualification(new MarketQualification(4.8F, "Good salt"));
		market2.setContact(new MarketContact("AZ@gmail.com", 245123L));

		//Market3
		Market market3 = new Market();

		market3.setName("Chucho Market");
		market3.setEstablishment(false);
		market3.setOnlyCash(true);
		market3.setLocation(new MarketLocation( 78L, 98L, "Parque Informatico"));
		market3.setOperatingHours(new MarketOperatingHours(
				false, null, null,
				false, null, null,
				false, null, null,
				true, LocalTime.of(06, 00), LocalTime.of(15, 00),
				false, null, null,
				true, LocalTime.of(06, 00), LocalTime.of(15, 00),
				true, LocalTime.of(06, 00), LocalTime.of(14, 00)));
		market3.setProducts(new MarketProducts(true, false,true, true,true,
				true,false, true,true,false, true, false,
				true,true, false,true,true,true,true,
				true,false, true,true,true, false,true,
				false, true,true,true,true, false, true,
				true,true,true,true,true,true,true,true,
				true, false, false, true, false, false, false,
				false, true, true,false, true,true,true,false,
				true,true,false, true, false, true,
				true, false,true,true,true,true,true,
				false, true,true,true, false,true, false, true,
				true,true,true, false, true,true,true,true,
				false,true, false, true,true,true,
				true, false, true, false ));
		market3.setQualification(new MarketQualification(4.8F, "Good lemons"));
		market3.setContact(new MarketContact("chucho@gmail.com", 3145123L));


		//Market4
		Market market4 = new Market();

		market4.setName("Homero Market");
		market4.setEstablishment(true);
		market4.setOnlyCash(false);
		market4.setLocation(new MarketLocation( 23434L, 924358L, "Calle 34 # 7-89"));
		market4.setOperatingHours(new MarketOperatingHours(
				true, LocalTime.of(06, 00), LocalTime.of(21, 00),
				true, LocalTime.of(06, 00), LocalTime.of(21, 00),
				true, LocalTime.of(06, 00), LocalTime.of(21, 00),
				true, LocalTime.of(06, 00), LocalTime.of(21, 00),
				true, LocalTime.of(06, 00), LocalTime.of(21, 00),
				true, LocalTime.of(06, 00), LocalTime.of(21, 00),
				true, LocalTime.of(06, 00), LocalTime.of(20, 00)));
		market4.setProducts(new MarketProducts(true, false,true, false,true,
				false,false, true,true,false, true, false,
				true,false, true,false,true,false,true,
				false,false, true,true,false, false,true,
				false, true,true,true,true, false, true,
				true,true,true,true,true,true,true,true,
				true, false, false, true, false, false, false,
				false, true, true,false, true,true,true,false,
				true,true,false, true, false, true,
				true, false,true,true,true,true,true,
				false, true,true,true, false,true, false, true,
				true,true,true, false, true,true,true,true,
				false,true, false, true,true,true,
				true, false, true, false ));
		market4.setQualification(new MarketQualification(3.0F, "Bad attention"));
		market4.setContact(new MarketContact("homo@gmail.com", 314670894L));

		//DB

		System.out.println("Markets in the database " + repository.findAll().size());

		repository.save(market1);
		repository.save(market2);
		repository.save(market3);
		repository.save(market4);


		System.out.println("Markets in the database " + repository.findAll().size());

	}
}
