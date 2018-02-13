/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.domain;

import com.example.demo.blo.interfaces.domain.IBrandBlo;
import com.example.demo.blo.interfaces.domain.ITypeOperationBlo;
import com.example.demo.entity.domain.Brand;
import com.example.demo.entity.domain.TypeOperation;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcortez
 */
@RestController
@RequestMapping(value="api/type-operation")
public class TypeOperationRest extends BaseRest<TypeOperation, Integer>{
    
    private final ITypeOperationBlo typeOperationBlo;
    
    /**
     * Inject blo
     *
     * @param typeOperationBlo interfaz blo
     */
    public TypeOperationRest(ITypeOperationBlo typeOperationBlo) {
        super(typeOperationBlo);
        this.typeOperationBlo = typeOperationBlo;
    }

    
}
