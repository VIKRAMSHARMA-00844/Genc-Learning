package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("25")
    private int age;
    @Autowired
    private Computer com;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Computer getCom() {
        return com;
    }
    @Autowired
    public void setCom(Computer com){
        this.com=com;
    }

    public void code()
    {
        com.Compile();
    }
}
