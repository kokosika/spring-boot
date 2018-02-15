/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.blo.blo.domain;

import com.example.demo.blo.interfaces.domain.IBrandBlo;
import com.example.demo.blo.interfaces.domain.IPaymentMethodBlo;
import com.example.demo.dao.interfaces.domain.IBrandDao;
import com.example.demo.dao.interfaces.domain.IPaymentMethodDao;
import com.example.demo.entity.domain.Brand;
import com.example.demo.entity.domain.PaymentMethod;
import com.example.demo.framework.blo.BaseDomainBlo;
import org.springframework.stereotype.Service;

/**
 * @author fcortez
 */
@Service
public class PaymentMethodBlo extends BaseDomainBlo<PaymentMethod, Integer> implements IPaymentMethodBlo {

    private final IPaymentMethodDao paymentMethodDao;

    /**
     * Inject dao
     *
     * @param paymentMethodDao base dao
     */
    public PaymentMethodBlo(IPaymentMethodDao paymentMethodDao) {
        super(paymentMethodDao);
        this.paymentMethodDao = paymentMethodDao;
    }

}
