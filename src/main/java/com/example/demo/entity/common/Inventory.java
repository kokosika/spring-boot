/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.framework.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author fcortez
 */
@Entity
public class Inventory extends BaseEntity {

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Product product;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Store store;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Operation operation;

}
