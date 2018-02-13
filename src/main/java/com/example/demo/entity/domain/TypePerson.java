/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.domain;

import com.example.demo.entity.common.Person;
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
public class TypePerson extends BaseDomainEntity {

    /**
     * @return the persons
     */
    public Set<Person> getPersons() {
        return persons;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typePerson")
    @JsonIgnore
    private Set<Person> persons;
}
