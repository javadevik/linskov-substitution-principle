package com.ua;

import com.ua.model.Order;

public interface Validator {
    /**
     * Validate order
     * @param order to validate
     * @return true if order is valid otherwise false
     */
    boolean isValid(Order order);
}
