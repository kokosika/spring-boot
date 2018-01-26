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
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author fcortez
 */
@Entity
public class User extends BaseEntity{
    
    @Column(length = 100,nullable = false,unique = true)
    private String userName;
    @Column(length = 100,nullable = false)
    private String password;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StateUser stateUser;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeUser typeUser;
    
    
    
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "user")
    @JsonIgnore
    private Account accounts;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StateUser getStateUser() {
        return stateUser;
    }

    public void setStateUser(StateUser stateUser) {
        this.stateUser = stateUser;
    }

    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser typeUser) {
        this.typeUser = typeUser;
    }
    
    
    
    
}
