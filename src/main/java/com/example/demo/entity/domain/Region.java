/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.framework.entity.BaseDomainEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Region extends BaseDomainEntity {

    /**
     * @return the country
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * @return the provinces
     */
    public Set<Province> getProvinces() {
        return provinces;
    }

    /**
     * @param provinces the provinces to set
     */
    public void setProvinces(Set<Province> provinces) {
        this.provinces = provinces;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Country country;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "region")
    @JsonIgnore
    private Set<Province> provinces;
}
