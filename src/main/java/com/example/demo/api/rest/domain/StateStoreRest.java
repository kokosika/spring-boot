/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.IStateStoreBlo;
import com.example.demo.entity.domain.StateStore;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/state-store")
public class StateStoreRest extends BaseRest<StateStore, Integer> {

    private final IStateStoreBlo stateStoreBlo;

    /**
     * Inject blo
     *
     * @param stateStoreBlo interfaz blo
     */
    public StateStoreRest(IStateStoreBlo stateStoreBlo) {
        super(stateStoreBlo);
        this.stateStoreBlo = stateStoreBlo;
    }


}
