/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.framework.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author fcortez
 */
@Entity
public class Stock extends BaseEntity {

    /**
     * @return the stock
     */
    public Double getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(Double stock) {
        this.stock = stock;
    }

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the store
     */
    public Store getStore() {
        return store;
    }

    /**
     * @param store the store to set
     */
    public void setStore(Store store) {
        this.store = store;
    }
    
    
    private Double stock;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product product;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Store store;


}
