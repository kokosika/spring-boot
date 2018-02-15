package com.example.demo.api.rest.common;

import com.example.demo.blo.interfaces.common.IEmployeeStoreBlo;
import com.example.demo.entity.common.EmployeeStore;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/employee-store")
public class EmployeeStoreRest extends BaseRest<EmployeeStore, Integer> {

    private final IEmployeeStoreBlo employeeStoreBlo;

    /**
     * Inject blo
     *
     * @param employeeStoreBlo interfaz blo
     */
    public EmployeeStoreRest(IEmployeeStoreBlo employeeStoreBlo) {
        super(employeeStoreBlo);
        this.employeeStoreBlo = employeeStoreBlo;
    }
}
