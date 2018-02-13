/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.EmployeeStore;
import com.example.demo.entity.common.Operation;
import com.example.demo.entity.common.Product;
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
public class TypeOperation extends BaseDomainEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeOperation")
    @JsonIgnore
    private Set<Operation> operations ;
}
