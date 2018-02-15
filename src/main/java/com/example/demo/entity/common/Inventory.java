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
public class Inventory extends BaseEntity {

    /**
     * @return the product
     */
    public Product getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * @return the store
     */
    public Store getStore() {
        return store;
    }

    /**
     * @param store the store to set
     */
    public void setStore(Store store) {
        this.store = store;
    }

    /**
     * @return the operation
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * @param operation the operation to set
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    /**
     * @return the inventoryCalendar
     */
    public InventoryCalendar getInventoryCalendar() {
        return inventoryCalendar;
    }

    /**
     * @param inventoryCalendar the inventoryCalendar to set
     */
    public void setInventoryCalendar(InventoryCalendar inventoryCalendar) {
        this.inventoryCalendar = inventoryCalendar;
    }

    /**
     * @return the inventoryTimes
     */
    public Set<InventoryTime> getInventoryTimes() {
        return inventoryTimes;
    }

    /**
     * @param inventoryTimes the inventoryTimes to set
     */
    public void setInventoryTimes(Set<InventoryTime> inventoryTimes) {
        this.inventoryTimes = inventoryTimes;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product product;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Store store;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Operation operation;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private InventoryCalendar inventoryCalendar;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventory")
    @JsonIgnore
    private Set<InventoryTime> inventoryTimes;

}
