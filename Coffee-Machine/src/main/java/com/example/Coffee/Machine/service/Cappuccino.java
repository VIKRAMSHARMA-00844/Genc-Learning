package com.example.Coffee.Machine.service;

import org.springframework.stereotype.Component;

@Component("Cappuccino")
public class Cappuccino implements Coffee{

    public String brew()
    {
        return "Cappuccino";
    }
}
