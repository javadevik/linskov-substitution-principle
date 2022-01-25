package com.ua;

import com.ua.model.Order;
import com.ua.model.Product;

public class OrderStockValidator implements Validator {
    /**
     * Method validating that order is in stock
     * @param order order to validate
     * @return true if order is in stock otherwise false
     */
    @Override
    public boolean isValid(Order order) {
        for (Product item : order.getItems()) {
            if (!item.isStock()) {
                return false;
            }
        }
        return true;
    }
}
