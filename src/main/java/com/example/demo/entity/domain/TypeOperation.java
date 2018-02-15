/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.Operation;
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
public class TypeOperation extends BaseDomainEntity {

    /**
     * @return the operations
     */
    public Set<Operation> getOperations() {
        return operations;
    }

    /**
     * @param operations the operations to set
     */
    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeOperation")
    @JsonIgnore
    private Set<Operation> operations;
}
