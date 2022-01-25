package com.ua.repos;

import com.ua.Repository;
import com.ua.model.Order;

public class OrderRepository implements Repository {
    @Override
    public boolean save(Order order) {
        return true;
    }
}
