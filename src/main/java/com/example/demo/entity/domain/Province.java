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
public class Province extends BaseDomainEntity {

    /**
     * @return the region
     */
    public Region getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(Region region) {
        this.region = region;
    }

    /**
     * @return the towns
     */
    public Set<Town> getTowns() {
        return towns;
    }

    /**
     * @param towns the towns to set
     */
    public void setTowns(Set<Town> towns) {
        this.towns = towns;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Region region;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "province")
    @JsonIgnore
    private Set<Town> towns;
}
