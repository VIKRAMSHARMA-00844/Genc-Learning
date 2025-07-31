package com.example.Coffee.Machine.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Qualifier("Latte")
@Scope("prototype")
public class Latte  implements CoffeeMachine {


    public String brew() {
        return "Latte";
    }

}
