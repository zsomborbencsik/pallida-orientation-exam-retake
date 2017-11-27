package com.greenfox.examretake.services;

import com.greenfox.examretake.models.Cart;
import com.greenfox.examretake.models.Item;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    public double calculateSubtotalPrice(Cart cart) {
        double price = 0.0;
        for (int i = 0; i < cart.getClothes().size(); i++) {
            price += cart.getClothes().get(i).getUnitPrice();
        }
        return price;
    }

}
