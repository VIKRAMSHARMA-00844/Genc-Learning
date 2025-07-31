package org.example;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public void Compile()
    {
        System.out.println("Compiling in Laptop");
    }

}
