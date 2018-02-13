/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IBrandBlo;
import com.example.demo.blo.interfaces.domain.IStateStoreBlo;
import com.example.demo.dao.interfaces.domain.IBrandDao;
import com.example.demo.dao.interfaces.domain.IStateStoreDao;
import com.example.demo.entity.domain.Brand;
import com.example.demo.entity.domain.StateStore;
import com.example.demo.framework.blo.BaseDomainBlo;
import com.example.demo.framework.dao.IBaseDao;
import org.springframework.stereotype.Service;

/**
 *
 * @author fcortez
 */
@Service
public class StateStoreBlo extends BaseDomainBlo<StateStore, Integer> implements IStateStoreBlo{
    
    private final IStateStoreDao stateStoreDao;
    
    /**
     * Inject dao
     *
     * @param stateStoreDao base dao
     */
    public StateStoreBlo(IStateStoreDao stateStoreDao) {
        super(stateStoreDao);
        this.stateStoreDao = stateStoreDao;
    }
    
}
