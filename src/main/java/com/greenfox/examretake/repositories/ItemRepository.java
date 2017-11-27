package com.greenfox.examretake.repositories;

import com.greenfox.examretake.models.Item;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public interface ItemRepository extends CrudRepository<Item, Long> {

    @Query(value = "SELECT DISTINCT item_name FROM warehouse", nativeQuery = true)
    List<String> getDistinctItemNames();

    @Query(value = "SELECT DISTINCT size FROM warehouse", nativeQuery = true)
    List<String> getDistinctSizes();

    @Query(value = "SELECT * FROM warehouse WHERE unit_price <= ?1 ", nativeQuery = true)
    List<Item> findByPriceLower(double price);

    @Query(value = "SELECT * FROM warehouse WHERE unit_price >= ?1 ", nativeQuery = true)
    List<Item> findByPriceHigher(double price);

    List<Item> findItemByItemNameAndSize(String itemName, String size);
}
