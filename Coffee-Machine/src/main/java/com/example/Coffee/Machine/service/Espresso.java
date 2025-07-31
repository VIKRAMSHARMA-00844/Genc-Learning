package com.example.Coffee.Machine.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
@Qualifier("Espresso")
public class Espresso implements CoffeeMachine {

    public Espresso(){
        System.out.println("Espresso Constructor Called.");
    }
    @PostConstruct
    public void init()
    {
        System.out.println("Espresso @PostConstruct");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Espresso @PreDestroy");
    }
    @Override
    public String brew()
    {
        return " Brewing an Espresso";
    }
}
