package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IEmployeeStoreBlo;
import com.example.demo.dao.interfaces.common.IEmployeeStoreDao;
import com.example.demo.entity.common.EmployeeStore;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeStoreBlo extends BaseBlo<EmployeeStore, Integer> implements IEmployeeStoreBlo {

    private final IEmployeeStoreDao employeeStoreDao;

    /**
     * Inject dao
     *
     * @param employeeStoreDao base dao
     */
    public EmployeeStoreBlo(IEmployeeStoreDao employeeStoreDao) {
        super(employeeStoreDao);
        this.employeeStoreDao = employeeStoreDao;
    }
}
