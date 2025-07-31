package com.example.Coffee.Machine.Project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    private final MessageSender emailSender;
    private final MessageSender smsSender;

    public NotificationService(@Qualifier("emailSender") MessageSender emailSender,
                               @Qualifier("smsSender") MessageSender smsSender)
    {
        this.emailSender=emailSender;
        this.smsSender=smsSender;
    }

    public void notifyUser()
    {
        emailSender.sendMessage();
        smsSender.sendMessage();

    }
}
