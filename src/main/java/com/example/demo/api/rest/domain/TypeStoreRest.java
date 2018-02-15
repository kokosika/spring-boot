/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.ITypeStoreBlo;
import com.example.demo.entity.domain.TypeStore;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/type-store")
public class TypeStoreRest extends BaseRest<TypeStore, Integer> {

    private final ITypeStoreBlo typeStoreBlo;

    /**
     * Inject blo
     *
     * @param typeStoreBlo interfaz blo
     */
    public TypeStoreRest(ITypeStoreBlo typeStoreBlo) {
        super(typeStoreBlo);
        this.typeStoreBlo = typeStoreBlo;
    }


}
