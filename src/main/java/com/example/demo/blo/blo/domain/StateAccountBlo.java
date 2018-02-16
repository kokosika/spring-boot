/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IStateAccountBlo;
import com.example.demo.dao.interfaces.domain.IStateAccountDao;
import com.example.demo.entity.domain.StateAccount;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class StateAccountBlo extends BaseDomainBlo<StateAccount, Integer> implements IStateAccountBlo {

    private final IStateAccountDao stateAccountDao;

    /**
     * Inject dao
     *
     * @param stateAccountDao base dao
     */
    public StateAccountBlo(IStateAccountDao stateAccountDao) {
        super(stateAccountDao);
        this.stateAccountDao = stateAccountDao;
    }

}
