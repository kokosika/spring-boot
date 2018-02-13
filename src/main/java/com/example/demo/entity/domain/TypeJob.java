/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.EmployeeStore;
import com.example.demo.entity.common.Person;
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
public class TypeJob extends BaseDomainEntity{

    /**
     * @return the employeeStores
     */
    public Set<EmployeeStore> getEmployeeStores() {
        return employeeStores;
    }

    /**
     * @param employeeStores the employeeStores to set
     */
    public void setEmployeeStores(Set<EmployeeStore> employeeStores) {
        this.employeeStores = employeeStores;
    }
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "typeJob")
    @JsonIgnore
    private Set<EmployeeStore> employeeStores;
}
