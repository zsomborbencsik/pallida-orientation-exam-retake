package com.greenfox.examretake.responses;

import com.greenfox.examretake.models.Item;

import java.util.List;

public class ItemResponse {

    String result;
    List<Item> clothes;

    public ItemResponse(String result, List<Item> clothes) {
        this.result = result;
        this.clothes = clothes;
    }

    public String getResult() {
        return result;
    }

    public ItemResponse() {
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
