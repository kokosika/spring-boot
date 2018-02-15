package com.example.demo.api.rest.common;


import com.example.demo.blo.interfaces.common.IOperationBlo;
import com.example.demo.entity.common.Operation;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/operation")
public class OperationRest extends BaseRest<Operation, Integer> {

    private final IOperationBlo operationBlo;

    /**
     * Inject blo
     *
     * @param operationBlo interfaz blo
     */
    public OperationRest(IOperationBlo operationBlo) {
        super(operationBlo);
        this.operationBlo = operationBlo;
    }
}
