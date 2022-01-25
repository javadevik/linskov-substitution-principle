package com.ua;

import com.ua.model.Order;
import com.ua.model.Product;

public class OrderStockAndPackedValidator extends OrderStockValidator {
    /**
     * Method validating that order is in stock and packed
     * @param order order to validate
     * @return true if order is in stock and packed otherwise false
     */
    @Override
    public boolean isValid(Order order) {
        for (Product item : order.getItems()) {
            if (!item.isStock() && !item.isPacked()) {
                return false;
            }
        }
        return true;
    }
}
