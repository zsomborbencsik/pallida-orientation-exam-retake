package com.greenfox.examretake.controllers;

import com.greenfox.examretake.responses.ItemResponse;
import com.greenfox.examretake.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemRestController {

    @Autowired
    ItemService itemService;

    @GetMapping("/warehouse/query")
    public Object filterItems(@RequestParam double price, @RequestParam String type) {
        ItemResponse response = new ItemResponse();
        if (type == null) {
            return "you messed up sumtin";
        }
        response.setClothes(itemService.filter(type,price));
        response.setResult("ok");
        return response;
    }
}
