/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.Province;
import com.example.demo.entity.domain.StatePerson;
import com.example.demo.entity.domain.Town;
import com.example.demo.entity.domain.TypePerson;
import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author fcortez
 */
@Entity
public class Person extends BaseEntity{
    
    @Column(length = 75,nullable = false)
    private String firstName;
    @Column(length = 75,nullable = false)
    private String lastName;    
    private Integer phone;
    private Integer cellPhone;    
    @Column(length = 100)
    private String address;
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Town town;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StatePerson statePerson;
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypePerson typePerson;
    
    
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "person")
    @JsonIgnore
    private Account accounts;

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(Integer cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public StatePerson getStatePerson() {
        return statePerson;
    }

    public void setStatePerson(StatePerson statePerson) {
        this.statePerson = statePerson;
    }

    public Account getAccounts() {
        return accounts;
    }

    public void setAccounts(Account accounts) {
        this.accounts = accounts;
    }
    
    
}
