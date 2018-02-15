/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.TypeOperation;
import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Operation extends BaseEntity {

    /**
     * @return the typeOperation
     */
    public TypeOperation getTypeOperation() {
        return typeOperation;
    }

    /**
     * @param typeOperation the typeOperation to set
     */
    public void setTypeOperation(TypeOperation typeOperation) {
        this.typeOperation = typeOperation;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return the inventorys
     */
    public Set<Inventory> getInventorys() {
        return inventorys;
    }

    /**
     * @param inventorys the inventorys to set
     */
    public void setInventorys(Set<Inventory> inventorys) {
        this.inventorys = inventorys;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeOperation typeOperation;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employee employee;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "operation")
    @JsonIgnore
    private Set<Inventory> inventorys;


}
