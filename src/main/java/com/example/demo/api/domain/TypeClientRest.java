/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.domain;

import com.example.demo.blo.interfaces.domain.ITypeClientBlo;
import com.example.demo.entity.domain.TypeClient;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/type-client")
public class TypeClientRest extends BaseRest<TypeClient, Integer> {

    private final ITypeClientBlo typeClientBlo;

    /**
     * Inject blo
     *
     * @param typeClientBlo interfaz blo
     */
    public TypeClientRest(ITypeClientBlo typeClientBlo) {
        super(typeClientBlo);
        this.typeClientBlo = typeClientBlo;
    }


}
