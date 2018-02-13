/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.framework.entity.BaseDomainEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Country extends BaseDomainEntity {

    /**
     * @return the regions
     */
    public Set<Region> getRegions() {
        return regions;
    }

    /**
     * @param regions the regions to set
     */
    public void setRegions(Set<Region> regions) {
        this.regions = regions;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
    @JsonIgnore
    private Set<Region> regions;
}
