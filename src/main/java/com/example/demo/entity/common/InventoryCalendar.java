/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.framework.entity.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * @author fcortez
 */
@Entity
public class InventoryCalendar extends BaseEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inventoryCalendar")
    @JsonIgnore
    private Set<Inventory> inventories;

}
