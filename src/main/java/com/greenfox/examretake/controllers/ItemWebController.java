package com.greenfox.examretake.controllers;

import com.greenfox.examretake.models.Item;
import com.greenfox.examretake.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemWebController {

    @Autowired
    ItemService itemService;

    @GetMapping("/warehouse")
    public String getAllItems(Model model) {
        model.addAttribute("items", itemService.getAllItem());
        model.addAttribute("newItem", itemService.getNewItem());
        model.addAttribute("distinctItem", itemService.getDistinctItemNames());
        model.addAttribute("distinctSize", itemService.getDistinctSizes());
        return "index";
    }

    @GetMapping("/select")
    public String addToCart(@RequestParam String itemName, @RequestParam(required = false) String size, Model model) {
        model.addAttribute("check", itemName);
        model.addAttribute("check", size);
        return "redirect:/warehouse";
    }


}
