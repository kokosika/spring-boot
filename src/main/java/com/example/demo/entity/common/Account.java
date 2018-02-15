/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.StateAccount;
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
     * @return the stateAccount
     */
    public StateAccount getStateAccount() {
        return stateAccount;
    }

    /**
     * @param stateAccount the stateAccount to set
     */
    public void setStateAccount(StateAccount stateAccount) {
        this.stateAccount = stateAccount;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

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
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StateAccount stateAccount;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "account")
    @JsonIgnore
    private Set<AccountAccess> accountAccesses;

}
