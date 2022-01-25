package com.ua;

import com.ua.model.Order;
import com.ua.model.Product;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        OrderProcess process = new OrderProcess();
        Order order = new Order("example@gmail.com",
                Collections.singleton(new Product("Yoyo", 99.9, true, true)));
        process.process(order);
    }
}
