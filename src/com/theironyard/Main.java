package com.theironyard;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

    EmailNotification emailNotification = new EmailNotification(LocalDateTime.now(), "Email_Notification_Subject", "Email_Notification_Body", "Email_Notification_Recipient"," Email_Notification_SMTP_Provider" );

    TextNotification textNotification = new TextNotification(LocalDateTime.now(),"Text_Notification_subject", "Text_Notification_Body", "Text_Notification_recipient","Text_Notification_SMS_Provider ");


    emailNotification.transport();

    System.out.println("-------------------------------------------------------------------------------------");

    textNotification.transport();

    System.out.println("-------------------------------------------------------------------------------------");

    emailNotification.showStatus();

    emailNotification.showProtectedStatus();

    try{
        Object emailNotificationClone = emailNotification.clone();
        final boolean bool = emailNotificationClone.equals(emailNotification);
        if(bool){
            System.out.println("Successful cloning");
        }
        else{
            System.out.println("Cloning failed");
        }
    }catch(CloneNotSupportedException e){
        System.out.println("Clone Not Supported Exception");
    }

   }
}
