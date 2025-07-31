package com.example.Coffee.Machine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class CoffeeMachineImplementation implements CoffeeMachine{

    @Autowired
    private ApplicationContext context;

    @Override
    public String makeCoffee(String type)
    {
        Coffee coffee=(Coffee) context.getBean(type);
        return coffee.brew();
    }
}
