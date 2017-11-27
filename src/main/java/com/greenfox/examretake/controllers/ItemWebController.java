package com.greenfox.examretake.controllers;

import com.greenfox.examretake.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemWebController {

    @Autowired
    ItemService itemService;

    @GetMapping("/warehouse")
    public String getAllItems(Model model) {
        model.addAttribute("items", itemService.getAllItem());
        return "index";
    }
}
