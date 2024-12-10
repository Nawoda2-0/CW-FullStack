package com.example.OOP_CW_w2051783;

import com.example.OOP_CW_w2051783.model.TicketConfig;
import com.example.OOP_CW_w2051783.service.ConfigHolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OopCwW2051783Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OopCwW2051783Application.class, args);


//		ConfigHolder configHolder = new ConfigHolder();
//		TicketConfig values = configHolder.getCurrentConfig();
//
//		System.out.println(values.getMaxTicketCapacity());


	}

}
