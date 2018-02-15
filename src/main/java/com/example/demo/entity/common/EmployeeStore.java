/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.TypeJob;
import com.example.demo.framework.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author fcortez
 */
@Entity
public class EmployeeStore extends BaseEntity {

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
     * @return the store
     */
    public Store getStore() {
        return store;
    }

    /**
     * @param store the store to set
     */
    public void setStore(Store store) {
        this.store = store;
    }

    /**
     * @return the typeJob
     */
    public TypeJob getTypeJob() {
        return typeJob;
    }

    /**
     * @param typeJob the typeJob to set
     */
    public void setTypeJob(TypeJob typeJob) {
        this.typeJob = typeJob;
    }
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employee employee;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Store store;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeJob typeJob;

}
