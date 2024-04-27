package com.codeinnova.CrudMercados.Config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//import java.nio.file.attribute.AclEntry;
//import java.util.Collections;

//http://localhost:8080/swagger-ui/index.html#/

@Configuration //Genera la documentacion de la api rest
public class MySwaggerConfig implements WebMvcConfigurer {

    @Bean //Es un bean que va a representar la documentacion para el api
    public OpenAPI customOpenAPI() {

        return new OpenAPI()
                .info(new io.swagger.v3.oas.models.info.Info()
                        .title("Spring Boot Markets API REST")
                        .version("1.0")
                        .description("Library Api rest docs")
                        .termsOfService("https://www.youtube.com/watch?v=ndenXpxSA9A")
                        .contact(new io.swagger.v3.oas.models.info.Contact()
                                .name("Marcela B.")
                                .url("https://www.youtube.com/shorts/rlHE29m1TSk")
                                .email("ebenachi17@gmail.com"))
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("MIT")
                                .url("https://www.youtube.com/watch?v=ndenXpxSA9A")));
    }



/*  OPCIÓN UNO (NO FUNCIONA)
    public Docket api(){ //esta clase es la interfaz principal al framework de springfox
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiDetails(){
        return new ApiInfo("Sprig Boot Markets API REST",
                "Library Api rest docs",
                "1.0",
                "https://www.youtube.com/watch?v=ndenXpxSA9A",
                new Contact("Marcela B.",
                "https://www.youtube.com/shorts/rlHE29m1TSk",
                "ebenachi17@gmail.com"),
                "MIT",
                "https://www.youtube.com/watch?v=ndenXpxSA9A",
                Collections.emptyList());

    }

 */
    /* OPCIÓN DOS (NO FUNCIONA)

    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.ant("/api/**"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot Markets API REST")
                .version("1.0")
                .description("Library Api rest docs")
                .termsOfServiceUrl("https://www.youtube.com/watch?v=ndenXpxSA9A")
                .build();
    }

     */


}
