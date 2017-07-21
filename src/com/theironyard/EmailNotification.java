package com.theironyard;

import java.time.LocalDateTime;

/**
 * Created by Vijee on 7/19/17.
 */
public class EmailNotification extends Notification {

    private String recipient;
    private String smtpProvider;

    public EmailNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smtpProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;
        this.status = "SENT";
    }


    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void transport() {
        System.out.println("Email Notification");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("Subject: " + getSubject());
        System.out.println();
        System.out.print("Body: " + getBody());
        System.out.println();
        System.out.print("Created At: " + getCreatedAt());
        System.out.println();
        System.out.println("Recipient: " + getRecipient());
        System.out.println();
        System.out.println("SMTP Provider: " + getSmtpProvider());
    }

    @Override
    public void showProtectedStatus() {
        System.out.println("-------------------------------------------------------------------------------------");
        super.showProtectedStatus();
        System.out.println("Overridden by something printed with public in Email Notification");
        System.out.println("-------------------------------------------------------------------------------------");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotification)) return false;

        EmailNotification that = (EmailNotification) o;

        if (!getRecipient().equals(that.getRecipient())) return false;
        return getSmtpProvider().equals(that.getSmtpProvider());
    }

    @Override
    public int hashCode() {
        int result = getRecipient().hashCode();
        result = 31 * result + getSmtpProvider().hashCode();
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        EmailNotification returnVal = new EmailNotification(getCreatedAt(), getSubject(), getBody(), getRecipient(),getSmtpProvider() );
        return returnVal;
    }
}
