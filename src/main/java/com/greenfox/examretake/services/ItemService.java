package com.greenfox.examretake.services;

import com.greenfox.examretake.models.Item;
import com.greenfox.examretake.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Iterable<Item> getAllItem() {
        return itemRepository.findAll();
    }
    public Item getNewItem() {
        return new Item();
    }
    public List<String> getDistinctItemNames() {
        return itemRepository.getDistinctItemNames();
    }

    public List<String> getDistinctSizes() {
        return itemRepository.getDistinctSizes();
    }
}
