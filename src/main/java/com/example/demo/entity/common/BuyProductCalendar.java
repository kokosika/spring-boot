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
public class BuyProductCalendar extends BaseEntity {

    /**
     * @return the buyProduct
     */
    public BuyProduct getBuyProduct() {
        return buyProduct;
    }

    /**
     * @param buyProduct the buyProduct to set
     */
    public void setBuyProduct(BuyProduct buyProduct) {
        this.buyProduct = buyProduct;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private BuyProduct buyProduct;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Employee employee;

}
