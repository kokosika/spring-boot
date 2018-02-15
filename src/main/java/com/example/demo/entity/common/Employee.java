/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.TypeEmployee;
import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Employee extends BaseEntity {

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     * @return the typeEmployee
     */
    public TypeEmployee getTypeEmployee() {
        return typeEmployee;
    }

    /**
     * @param typeEmployee the typeEmployee to set
     */
    public void setTypeEmployee(TypeEmployee typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

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
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Person person;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeEmployee typeEmployee;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    @JsonIgnore
    private Set<EmployeeStore> employeeStores;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    @JsonIgnore
    private Set<Operation> operations;

}
