/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.IStateAccountBlo;
import com.example.demo.entity.domain.StateAccount;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/state-account")
public class StateAccountRest extends BaseRest<StateAccount, Integer> {

    private final IStateAccountBlo stateAccountBlo;

    /**
     * Inject blo
     *
     * @param stateAccountBlo interfaz blo
     */
    public StateAccountRest(IStateAccountBlo stateAccountBlo) {
        super(stateAccountBlo);
        this.stateAccountBlo = stateAccountBlo;
    }


}
