/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IEmployeeBlo;
import com.example.demo.entity.common.Employee;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/employee")
public class EmployeeRest extends BaseRest<Employee, Integer> {

    private final IEmployeeBlo employeeBlo;

    /**
     * Inject blo
     *
     * @param employeeBlo interfaz blo
     */
    public EmployeeRest(IEmployeeBlo employeeBlo) {
        super(employeeBlo);
        this.employeeBlo = employeeBlo;
    }

}
