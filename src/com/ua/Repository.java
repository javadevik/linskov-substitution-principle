package com.ua;

import com.ua.model.Order;

public interface Repository {
    /**
     * Save order to database
     * @param order to save
     * @return true if order have saved otherwise false
     */
    boolean save(Order order);
}
