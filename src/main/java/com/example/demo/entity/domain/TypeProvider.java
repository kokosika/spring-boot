/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.Provider;
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
public class TypeProvider extends BaseDomainEntity {

    /**
     * @return the providers
     */
    public Set<Provider> getProviders() {
        return providers;
    }

    /**
     * @param providers the providers to set
     */
    public void setProviders(Set<Provider> providers) {
        this.providers = providers;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeProvider")
    @JsonIgnore
    private Set<Provider> providers;
}
