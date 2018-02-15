/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class BuyProductDetail extends BaseEntity {

    /**
     * @return the buyProduct
     */
    public BuyProduct getBuyProduct() {
        return buyProduct;
    }

    /**
     * @param buyProduct the buyProduct to set
     */
    public void setBuyProduct(BuyProduct buyProduct) {
        this.buyProduct = buyProduct;
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
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BuyProduct buyProduct;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product product;
}
