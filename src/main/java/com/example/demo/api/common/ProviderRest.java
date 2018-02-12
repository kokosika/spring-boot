/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IProviderBlo;
import com.example.demo.entity.common.Provider;
import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/provider")
public class ProviderRest extends BaseRest<Provider, Integer>{
    
    private final IProviderBlo providerBlo;
    
     /**
     * Inject blo
     *
     * @param providerBlo interfaz blo
     */
    public ProviderRest(IProviderBlo providerBlo) {
        super(providerBlo);
        this.providerBlo = providerBlo;
    }
    
}
