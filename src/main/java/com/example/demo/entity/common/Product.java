/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.Brand;
import com.example.demo.entity.domain.Category;
import com.example.demo.entity.domain.StateProduct;
import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Product extends BaseEntity {

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the brand
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /**
     * @return the stateProduct
     */
    public StateProduct getStateProduct() {
        return stateProduct;
    }

    /**
     * @param stateProduct the stateProduct to set
     */
    public void setStateProduct(StateProduct stateProduct) {
        this.stateProduct = stateProduct;
    }

    /**
     * @return the inventorys
     */
    public Set<Inventory> getInventorys() {
        return inventorys;
    }

    /**
     * @param inventorys the inventorys to set
     */
    public void setInventorys(Set<Inventory> inventorys) {
        this.inventorys = inventorys;
    }

    /**
     * @return the stocks
     */
    public Set<Stock> getStocks() {
        return stocks;
    }

    /**
     * @param stocks the stocks to set
     */
    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Category category;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Brand brand;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StateProduct stateProduct;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    @JsonIgnore
    private Set<Inventory> inventorys;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    @JsonIgnore
    private Set<Stock> stocks;
}
