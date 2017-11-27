package com.greenfox.examretake.services;

import com.greenfox.examretake.models.Item;
import com.greenfox.examretake.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Iterable<Item> getAllItem() {
        return itemRepository.findAll();
    }
}
