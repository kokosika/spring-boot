/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IStateProductBlo;
import com.example.demo.dao.interfaces.domain.IStateProductDao;
import com.example.demo.entity.domain.StateProduct;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcortez
 */
@Service
public class StateProductBlo extends BaseDomainBlo<StateProduct, Integer> implements IStateProductBlo{
    
    private final IStateProductDao stateProductDao;
    
    /**
     * Inject dao
     *
     * @param stateProductDao base dao
     */
    public StateProductBlo(IStateProductDao stateProductDao) {
        super(stateProductDao);
        this.stateProductDao = stateProductDao;
    }
    
}
