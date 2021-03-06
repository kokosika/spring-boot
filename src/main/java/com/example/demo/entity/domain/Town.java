/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.Person;
import com.example.demo.entity.common.Store;
import com.example.demo.framework.entity.BaseDomainEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Town extends BaseDomainEntity {

    /**
     * @return the province
     */
    public Province getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(Province province) {
        this.province = province;
    }

    /**
     * @return the persons
     */
    public Set<Person> getPersons() {
        return persons;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

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

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Province province;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "town")
    @JsonIgnore
    private Set<Person> persons;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "town")
    @JsonIgnore
    private Set<Store> stores;

}
