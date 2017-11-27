package com.greenfox.examretake.models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> clothes;

    public Cart(List<Item> clothes) {
        this.clothes = clothes;
    }

    public void populateCart(int quantity, Item item) {
        for (int i = 0; i < quantity; i++) {
            this.clothes.add(item);
        }
    }

    public Cart() {
    }

    public List<Item> getClothes() {
        return clothes;
    }

    public void setClothes(List<Item> clothes) {
        this.clothes = clothes;
    }

}
