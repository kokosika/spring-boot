/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.TypeProvider;
import com.example.demo.framework.entity.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author fcortez
 */
@Entity
public class Provider extends BaseEntity{
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Person person;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeProvider typeProvider;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public TypeProvider getTypeProvider() {
        return typeProvider;
    }

    public void setTypeProvider(TypeProvider typeProvider) {
        this.typeProvider = typeProvider;
    }
    
}