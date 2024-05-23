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

		Markets market1 = new Markets();
		
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
		market1.setProducts(new MarketProducts(true, true, false, true, true,
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
		Markets market2 = new Markets();

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
		market2.setProducts(new MarketProducts(true, true,false, true,true,
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

		//DB

		System.out.println("Markets in the database " + repository.findAll().size());

		repository.save(market1);
		repository.save(market2);


		System.out.println("Markets in the database " + repository.findAll().size());

	}
}
