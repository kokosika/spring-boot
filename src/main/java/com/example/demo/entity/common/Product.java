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
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author fcortez
 */
@Entity
public class Product extends BaseEntity{
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Category category;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Brand brand;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StateProduct stateProduct;

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
    
    
}
