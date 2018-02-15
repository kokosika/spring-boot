/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.TypeClient;
import com.example.demo.framework.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author fcortez
 */
@Entity
public class Client extends BaseEntity {

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
     * @return the typeClient
     */
    public TypeClient getTypeClient() {
        return typeClient;
    }

    /**
     * @param typeClient the typeClient to set
     */
    public void setTypeClient(TypeClient typeClient) {
        this.typeClient = typeClient;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Person person;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeClient typeClient;

}
