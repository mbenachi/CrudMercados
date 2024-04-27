package com.codeinnova.CrudMercados;

import com.codeinnova.CrudMercados.Entities.Markets;
import com.codeinnova.CrudMercados.Repository.MarketsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
@ComponentScan(basePackages = {"com.codeinnova.CrudMercados", "org.springdoc"}) // Escanea los componentes de la aplicación y de Springdoc
@EnableJpaRepositories(basePackages = {"com.codeinnova.CrudMercados.Repository"}) // Habilita la exploración de los repositorios JPA
public class CrudMercadosApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CrudMercadosApplication.class, args);
		MarketsRepository repository = context.getBean(MarketsRepository.class);

		//Create markets

		 	//Market1
		Set<DayOfWeek> openingDays1 = new HashSet<>();
		openingDays1.add(DayOfWeek.MONDAY);
		openingDays1.add(DayOfWeek.TUESDAY);
		openingDays1.add(DayOfWeek.WEDNESDAY);
		openingDays1.add(DayOfWeek.THURSDAY);
		openingDays1.add(DayOfWeek.FRIDAY);
		openingDays1.add(DayOfWeek.SATURDAY);
		openingDays1.add(DayOfWeek.SUNDAY);

		Markets market1 = new Markets(null, "Pedro Market", "Calle 5 #7-38", openingDays1, LocalTime.of(8, 0),
				LocalTime.of(20, 0), true, false, true, true, true, false, true);

			//Market2

		Set<DayOfWeek> openingDays2 = new HashSet<>();
		openingDays2.add(DayOfWeek.THURSDAY);
		openingDays2.add(DayOfWeek.SUNDAY);

		Markets market2 = new Markets(null, "Pedriño", "Calle 6 #8-54", openingDays2, LocalTime.of(6, 30),
				LocalTime.of(16, 0), false, true, true, false, false, false, true);

			//Market3

		Set<DayOfWeek> openingDays3 = new HashSet<>();
		openingDays3.add(DayOfWeek.SUNDAY);

		Markets market3 = new Markets(null, "Donde Tulia", "Calle 48 #3", openingDays3, LocalTime.of(6, 30),
				LocalTime.of(14, 0), false, true, true, false, false, false, true);

		//DB

		System.out.println("Markets in the database " + repository.findAll().size());

		repository.save(market1);
		repository.save(market2);
		repository.save(market3);

		System.out.println("Markets in the database " + repository.findAll().size());

	}

}
