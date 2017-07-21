package com.theironyard;

import java.time.LocalDateTime;

/**
 * Created by Vijee on 7/19/17.
 */

public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "working";


    public Notification(LocalDateTime createdAt, String subject, String body) {
        this.createdAt = createdAt;
        this.subject = subject;
        this.body = body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public abstract void transport();

    public void showStatus(){
        System.out.println("Protected variable status: (Changed the value in email notification) :  " + status);
    }

    protected void showProtectedStatus(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Test: Print something from inside protected method in notification");
        System.out.println("-----------------------------------------------------");
    }
}

