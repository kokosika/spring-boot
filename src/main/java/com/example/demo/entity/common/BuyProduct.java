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
public class BuyProduct extends BaseEntity {

    /**
     * @return the buyProductDetails
     */
    public Set<BuyProductDetail> getBuyProductDetails() {
        return buyProductDetails;
    }

    /**
     * @param buyProductDetails the buyProductDetails to set
     */
    public void setBuyProductDetails(Set<BuyProductDetail> buyProductDetails) {
        this.buyProductDetails = buyProductDetails;
    }

    /**
     * @return the provider
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    /**
     * @return the buyProductCalendars
     */
    public Set<BuyProductCalendar> getBuyProductCalendars() {
        return buyProductCalendars;
    }

    /**
     * @param buyProductCalendars the buyProductCalendars to set
     */
    public void setBuyProductCalendars(Set<BuyProductCalendar> buyProductCalendars) {
        this.buyProductCalendars = buyProductCalendars;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Provider provider;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buyProduct")
    @JsonIgnore
    private Set<BuyProductCalendar> buyProductCalendars;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buyProduct")
    @JsonIgnore
    private Set<BuyProductDetail> buyProductDetails;
    
}
