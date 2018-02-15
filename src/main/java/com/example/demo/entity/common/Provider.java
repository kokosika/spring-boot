/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.TypeProvider;
import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author fcortez
 */
@Entity
public class Provider extends BaseEntity {

    /**
     * @return the buyProducts
     */
    public Set<BuyProduct> getBuyProducts() {
        return buyProducts;
    }

    /**
     * @param buyProducts the buyProducts to set
     */
    public void setBuyProducts(Set<BuyProduct> buyProducts) {
        this.buyProducts = buyProducts;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return the typeProvider
     */
    public TypeProvider getTypeProvider() {
        return typeProvider;
    }

    /**
     * @param typeProvider the typeProvider to set
     */
    public void setTypeProvider(TypeProvider typeProvider) {
        this.typeProvider = typeProvider;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Person person;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeProvider typeProvider;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "provider")
    @JsonIgnore
    private Set<BuyProduct> buyProducts;

}
