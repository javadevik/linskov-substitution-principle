package com.ua;

import com.ua.model.Order;
import com.ua.repos.OrderRepository;

public class OrderProcess {
    public void process(Order order) {
        Repository repository = new OrderRepository();
        Validator orderValidator = new OrderStockAndPackedValidator();
        if (orderValidator.isValid(order) && repository.save(order)) {
            Sender sender = new ConfirmationGmailSender();
            sender.send(order.getEmail());
            System.out.println("Confirmation email was send");
        }
    }
}
