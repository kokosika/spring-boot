/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Account extends BaseEntity {

    /**
     * @return the accountAccesses
     */
    public Set<AccountAccess> getAccountAccesses() {
        return accountAccesses;
    }

    /**
     * @param accountAccesses the accountAccesses to set
     */
    public void setAccountAccesses(Set<AccountAccess> accountAccesses) {
        this.accountAccesses = accountAccesses;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User user;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Person person;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    @JsonIgnore
    private Set<AccountAccess> accountAccesses;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}
