/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.domain;

import com.example.demo.blo.interfaces.domain.IStateProductBlo;
import com.example.demo.entity.domain.StateProduct;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/state-product")
public class StateProductRest extends BaseRest<StateProduct, Integer> {
    
    private final IStateProductBlo stateProductBlo;
    
    /**
     * Inject blo
     *
     * @param stateProductBlo interfaz blo
     */
    public StateProductRest(IStateProductBlo stateProductBlo) {
        super(stateProductBlo);
        this.stateProductBlo = stateProductBlo;
    }
    
}
