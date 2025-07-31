package com.example.Coffee.Machine.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CoffeeMachineProjectApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(CoffeeMachineProjectApplication.class, args);
		NotificationService obj=context.getBean(NotificationService.class);
		obj.notifyUser();

	}

}
