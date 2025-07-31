package com.example.Coffee.Machine.Project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Qualifier("smsSender")

@Component
public class SmsSender implements MessageSender{

    @Override
    public void sendMessage() {
        System.out.println("Send Message via SMS");
    }
}
