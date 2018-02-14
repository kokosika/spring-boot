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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public StateProduct getStateProduct() {
        return stateProduct;
    }

    public void setStateProduct(StateProduct stateProduct) {
        this.stateProduct = stateProduct;
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
