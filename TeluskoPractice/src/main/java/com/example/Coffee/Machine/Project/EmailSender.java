package com.example.Coffee.Machine.Project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("emailSender")
public class EmailSender implements MessageSender{

    @Override
    public void sendMessage() {
        System.out.println("Send Message via Email");
    }
}
