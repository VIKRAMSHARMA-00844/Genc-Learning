package com.example.Coffee.Machine;

import com.example.Coffee.Machine.service.CoffeeMachine;
import com.example.Coffee.Machine.service.CoffeeMachineImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoffeeMachineApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(CoffeeMachineApplication.class, args);

		//CoffeeMachineImplementation cmi=context.getBean(CoffeeMachineApplication.class);

		CoffeeMachine cm=context.getBean(CoffeeMachine.class);

		System.out.println("Please order you Coffee...");

		System.out.println(cm.makeCoffee("Espresso"));

		System.out.println(cm.makeCoffee("Latte"));

		System.out.println(cm.makeCoffee("Cappuccino"));

	}

}
