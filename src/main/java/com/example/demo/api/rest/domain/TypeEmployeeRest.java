/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.IBrandBlo;
import com.example.demo.blo.interfaces.domain.ITypeEmployeeBlo;
import com.example.demo.entity.domain.Brand;
import com.example.demo.entity.domain.TypeEmployee;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/type-employee")
public class TypeEmployeeRest extends BaseRest<TypeEmployee, Integer> {

    private final ITypeEmployeeBlo typeEmployeeBlo;

    /**
     * Inject blo
     *
     * @param typeEmployeeBlo interfaz blo
     */
    public TypeEmployeeRest(ITypeEmployeeBlo typeEmployeeBlo) {
        super(typeEmployeeBlo);
        this.typeEmployeeBlo = typeEmployeeBlo;
    }


}
