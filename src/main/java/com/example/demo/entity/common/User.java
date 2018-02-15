/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.StateUser;
import com.example.demo.entity.domain.TypeUser;
import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * @author fcortez
 */
@Entity
public class User extends BaseEntity {

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the stateUser
     */
    public StateUser getStateUser() {
        return stateUser;
    }

    /**
     * @param stateUser the stateUser to set
     */
    public void setStateUser(StateUser stateUser) {
        this.stateUser = stateUser;
    }

    /**
     * @return the typeUser
     */
    public TypeUser getTypeUser() {
        return typeUser;
    }

    /**
     * @param typeUser the typeUser to set
     */
    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    /**
     * @return the accounts
     */
    public Account getAccounts() {
        return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(Account accounts) {
        this.accounts = accounts;
    }
    @Column(length = 100, nullable = false, unique = true)
    private String userName;
    @Column(length = 100, nullable = false)
    private String password;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StateUser stateUser;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeUser typeUser;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    @JsonIgnore
    private Account accounts;

}
