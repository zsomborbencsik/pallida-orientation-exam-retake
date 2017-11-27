package com.greenfox.examretake.repositories;

import com.greenfox.examretake.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
