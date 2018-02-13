/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.StateProduct;
import com.example.demo.entity.domain.TypeOperation;
import com.example.demo.framework.entity.BaseEntity;
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
public class Operation extends BaseEntity{
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeOperation typeOperation;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employee employee;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "operation")
    @JsonIgnore
    private Set<Inventory> inventorys ;
    
    
    
}
