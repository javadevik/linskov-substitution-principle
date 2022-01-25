package com.ua;

public class ConfirmationGmailSender implements Sender {
    /**
     * Send confirmation email to user
     * @param email to send
     */
    @Override
    public void send(String email) {
        System.out.println("Send confirmation message to " + email);
    }
}
