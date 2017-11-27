package com.greenfox.examretake.models;

import javax.persistence.*;

@Entity
@Table(name = "warehouse")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;
    @Column(name = "item_name")
    String itemName;
    String manufacturer;
    String category;
    String size;
    @Column(name = "unit_price")
    double unitPrice;
    @Column(name = "in_store")
    String inStore;

    public Item(String itemName, String manufacturer, String category, String size, double unitPrice, String inStore) {
        this.itemName = itemName;
        this.manufacturer = manufacturer;
        this.category = category;
        this.size = size;
        this.unitPrice = unitPrice;
        this.inStore = inStore;
    }

    public Item() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String isInStore() {
        return inStore;
    }

    public void setInStore(String inStore) {
        this.inStore = inStore;
    }
}
