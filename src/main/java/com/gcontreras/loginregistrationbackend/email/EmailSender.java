package com.gcontreras.loginregistrationbackend.email;

public interface EmailSender {
    void sendEmail(String to, String email);
}
