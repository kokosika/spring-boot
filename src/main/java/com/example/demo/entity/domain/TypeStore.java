/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.Product;
import com.example.demo.entity.common.Store;
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
public class TypeStore extends BaseDomainEntity{

    /**
     * @return the stores
     */
    public Set<Store> getStores() {
        return stores;
    }

    /**
     * @param stores the stores to set
     */
    public void setStores(Set<Store> stores) {
        this.stores = stores;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "typeStore")
    @JsonIgnore
    private Set<Store> stores;
}
