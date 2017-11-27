package com.greenfox.examretake.controllers;

import com.greenfox.examretake.models.Cart;
import com.greenfox.examretake.models.Item;
import com.greenfox.examretake.services.CartService;
import com.greenfox.examretake.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ItemWebController {

    @Autowired
    ItemService itemService;

    @Autowired
    CartService cartService;

    Cart userCart;

    @GetMapping("/warehouse")
    public String getAllItems(Model model) {
        model.addAttribute("items", itemService.getAllItem());
        model.addAttribute("newItem", itemService.getNewItem());
        model.addAttribute("distinctItem", itemService.getDistinctItemNames());
        model.addAttribute("distinctSize", itemService.getDistinctSizes());
        return "index";
    }

    @PostMapping("/warehouse/summary")
    public String addToCart(@RequestParam String itemName, @RequestParam String size,@RequestParam int quantity, Model model) {
        List<Item> tempList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            tempList.add(itemService.findByNameandSize(itemName,size).get(0));
        }
        this.userCart = new Cart("ok",tempList);
        model.addAttribute("price", cartService.calculateSubtotalPrice(userCart));
        model.addAttribute("itemSelected", this.userCart);
        model.addAttribute("quantity",this.userCart.getClothes().size());
        return "summary";
    }


}
