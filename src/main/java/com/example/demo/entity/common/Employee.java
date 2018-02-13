/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.TypeEmployee;
import com.example.demo.framework.entity.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author fcortez
 */
@Entity
public class Employee extends BaseEntity{
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Person person;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeEmployee typeEmployee;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public TypeEmployee getEmployee() {
        return typeEmployee;
    }

    public void setEmployee(TypeEmployee typeEmployee) {
        this.typeEmployee = typeEmployee;
    }
}
