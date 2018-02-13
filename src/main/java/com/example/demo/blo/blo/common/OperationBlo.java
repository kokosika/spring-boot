package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IOperationBlo;
import com.example.demo.dao.interfaces.common.IOperationDao;
import com.example.demo.entity.common.Operation;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class OperationBlo extends BaseBlo<Operation, Integer> implements IOperationBlo {

    private final IOperationDao operationDao;

    /**
     * Inject dao
     *
     * @param operationDao base dao
     */
    public OperationBlo(IOperationDao operationDao) {
        super(operationDao);
        this.operationDao = operationDao;
    }
}
