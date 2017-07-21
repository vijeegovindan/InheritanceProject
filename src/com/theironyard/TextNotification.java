package com.theironyard;

import java.time.LocalDateTime;

/**
 * Created by Vijee on 7/19/17.
 */
public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smsProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;

        this.showProtectedStatus();
    }


    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("Text Notification");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Subject: " + getSubject());
        System.out.println();
        System.out.print("Body: " + getBody());
        System.out.println();
        System.out.print("Created At: " + getCreatedAt());
        System.out.println();
        System.out.println("Recipient: " + getRecipient());
        System.out.println();
        System.out.println("SMTP Provider: " + getSmsProvider());
    }
}
