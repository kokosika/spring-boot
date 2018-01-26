/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.Person;
import com.example.demo.framework.entity.BaseDomainEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author fcortez
 */
@Entity
public class Town extends BaseDomainEntity{
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Province province;
    
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "town")
    @JsonIgnore
    private Set<Person> persons;

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
    
    
    
}
