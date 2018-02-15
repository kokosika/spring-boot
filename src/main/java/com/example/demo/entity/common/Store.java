/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.StateStore;
import com.example.demo.entity.domain.Town;
import com.example.demo.entity.domain.TypeStore;
import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class Store extends BaseEntity {

    /**
     * @return the typeStore
     */
    public TypeStore getTypeStore() {
        return typeStore;
    }

    /**
     * @param typeStore the typeStore to set
     */
    public void setTypeStore(TypeStore typeStore) {
        this.typeStore = typeStore;
    }

    /**
     * @return the stateStore
     */
    public StateStore getStateStore() {
        return stateStore;
    }

    /**
     * @param stateStore the stateStore to set
     */
    public void setStateStore(StateStore stateStore) {
        this.stateStore = stateStore;
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
     * @return the employeeStores
     */
    public Set<EmployeeStore> getEmployeeStores() {
        return employeeStores;
    }

    /**
     * @param employeeStores the employeeStores to set
     */
    public void setEmployeeStores(Set<EmployeeStore> employeeStores) {
        this.employeeStores = employeeStores;
    }

    /**
     * @return the inventorys
     */
    public Set<Inventory> getInventorys() {
        return inventorys;
    }

    /**
     * @param inventorys the inventorys to set
     */
    public void setInventorys(Set<Inventory> inventorys) {
        this.inventorys = inventorys;
    }

    /**
     * @return the stocks
     */
    public Set<Stock> getStocks() {
        return stocks;
    }

    /**
     * @param stocks the stocks to set
     */
    public void setStocks(Set<Stock> stocks) {
        this.stocks = stocks;
    }
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeStore typeStore;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StateStore stateStore;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Town town;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    @JsonIgnore
    private Set<EmployeeStore> employeeStores;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    @JsonIgnore
    private Set<Inventory> inventorys;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "store")
    @JsonIgnore
    private Set<Stock> stocks;

}
