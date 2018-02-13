/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IEmployeeBlo;
import com.example.demo.dao.interfaces.common.IEmployeeDao;
import com.example.demo.entity.common.Employee;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class EmployeeBlo extends BaseBlo<Employee, Integer> implements IEmployeeBlo {

    private final IEmployeeDao employeeDao;

    /**
     * Inject dao
     *
     * @param employeeDao base dao
     */
    public EmployeeBlo(IEmployeeDao employeeDao) {
        super(employeeDao);
        this.employeeDao = employeeDao;
    }

}
