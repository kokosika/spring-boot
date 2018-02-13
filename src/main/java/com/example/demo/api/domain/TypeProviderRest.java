/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.domain;

import com.example.demo.blo.interfaces.domain.ITypeProviderBlo;
import com.example.demo.entity.domain.TypeProvider;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/type-provider")
public class TypeProviderRest extends BaseRest<TypeProvider, Integer> {

    private final ITypeProviderBlo typeProviderBlo;

    /**
     * Inject blo
     *
     * @param typeProviderBlo interfaz blo
     */
    public TypeProviderRest(ITypeProviderBlo typeProviderBlo) {
        super(typeProviderBlo);
        this.typeProviderBlo = typeProviderBlo;
    }


}
