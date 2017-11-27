package com.greenfox.examretake.models;

import java.util.List;

public class Cart {

    String result;
    List<Item> clothes;

    public Cart(String result, List<Item> clothes) {
        this.result = result;
        this.clothes = clothes;
    }

    public Cart() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<Item> getClothes() {
        return clothes;
    }

    public void setClothes(List<Item> clothes) {
        this.clothes = clothes;
    }
}
