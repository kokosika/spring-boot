/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity.common;

import com.example.demo.entity.domain.StateStore;
import com.example.demo.entity.domain.Town;
import com.example.demo.entity.domain.TypeStore;
import com.example.demo.entity.domain.TypeUser;
import com.example.demo.framework.entity.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author fcortez
 */
@Entity
public class Store extends BaseEntity{
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TypeStore typeStore;    
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private StateStore stateStore;    
    
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Town town;

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }   

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
    
}
