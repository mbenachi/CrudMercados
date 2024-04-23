package com.codeinnova.CrudMercados;

import com.codeinnova.CrudMercados.Entities.Markets;
import com.codeinnova.CrudMercados.Repository.MarketsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CrudMercadosApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(CrudMercadosApplication.class, args);
		MarketsRepository repository = context.getBean(MarketsRepository.class);

		//Create market

	}




}
