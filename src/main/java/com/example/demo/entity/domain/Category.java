/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.Client;
import com.example.demo.entity.common.Product;
import com.example.demo.framework.entity.BaseDomainEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author fcortez
 */
@Entity
public class Category extends BaseDomainEntity{

    /**
     * @return the products
     */
    public Set<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(Set<Product> products) {
        this.products = products;
    }
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    @JsonIgnore
    private Set<Product> products;
    
}
