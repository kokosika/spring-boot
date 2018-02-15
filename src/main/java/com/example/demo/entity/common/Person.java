/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.StatePerson;
import com.example.demo.entity.domain.Town;
import com.example.demo.entity.domain.TypePerson;
import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Person extends BaseEntity {

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phone
     */
    public Integer getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    /**
     * @return the cellPhone
     */
    public Integer getCellPhone() {
        return cellPhone;
    }

    /**
     * @param cellPhone the cellPhone to set
     */
    public void setCellPhone(Integer cellPhone) {
        this.cellPhone = cellPhone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the town
     */
    public Town getTown() {
        return town;
    }

    /**
     * @param town the town to set
     */
    public void setTown(Town town) {
        this.town = town;
    }

    /**
     * @return the statePerson
     */
    public StatePerson getStatePerson() {
        return statePerson;
    }

    /**
     * @param statePerson the statePerson to set
     */
    public void setStatePerson(StatePerson statePerson) {
        this.statePerson = statePerson;
    }

    /**
     * @return the typePerson
     */
    public TypePerson getTypePerson() {
        return typePerson;
    }

    /**
     * @param typePerson the typePerson to set
     */
    public void setTypePerson(TypePerson typePerson) {
        this.typePerson = typePerson;
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

    /**
     * @return the clients
     */
    public Set<Client> getClients() {
        return clients;
    }

    /**
     * @param clients the clients to set
     */
    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    /**
     * @return the providers
     */
    public Set<Provider> getProviders() {
        return providers;
    }

    /**
     * @param providers the providers to set
     */
    public void setProviders(Set<Provider> providers) {
        this.providers = providers;
    }

    /**
     * @return the employee
     */
    public Set<Employee> getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Set<Employee> employee) {
        this.employee = employee;
    }

    @Column(length = 75, nullable = false)
    private String firstName;
    @Column(length = 75, nullable = false)
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


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "person")
    @JsonIgnore
    private Account accounts;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    @JsonIgnore
    private Set<Client> clients;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    @JsonIgnore
    private Set<Provider> providers;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    @JsonIgnore
    private Set<Employee> employee;

}
