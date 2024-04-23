package com.codeinnova.CrudMercados;

import com.codeinnova.CrudMercados.Entities.Markets;
import com.codeinnova.CrudMercados.Repository.MarketsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class CrudMercadosApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CrudMercadosApplication.class, args);
		MarketsRepository repository = context.getBean(MarketsRepository.class);

		Set<DayOfWeek> openingDays = new HashSet<>();
		openingDays.add(DayOfWeek.MONDAY);
		openingDays.add(DayOfWeek.TUESDAY);
		openingDays.add(DayOfWeek.WEDNESDAY);
		openingDays.add(DayOfWeek.THURSDAY);
		openingDays.add(DayOfWeek.FRIDAY);
		openingDays.add(DayOfWeek.SATURDAY);
		openingDays.add(DayOfWeek.SUNDAY);

		//Create market

		Markets market1 = new Markets(null, "Pedro Market", "Calle 5 #7-19", openingDays,
				LocalTime.of(7, 0), LocalTime.of(20, 0), true, false,
				"legumbres,Tuberculos, Frutas, Carnes");

		//DB

		System.out.println("Markets in the database " + repository.findAll().size());

		repository.save(market1);

		System.out.println("Markets in the database " + repository.findAll().size());

	}




}
