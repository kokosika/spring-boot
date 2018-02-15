/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.ITypeJobBlo;
import com.example.demo.entity.domain.TypeJob;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/type-job")
public class TypeJobRest extends BaseRest<TypeJob, Integer> {

    private final ITypeJobBlo typeJobBlo;

    /**
     * Inject blo
     *
     * @param typeJobBlo interfaz blo
     */
    public TypeJobRest(ITypeJobBlo typeJobBlo) {
        super(typeJobBlo);
        this.typeJobBlo = typeJobBlo;
    }


}
