/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.IBrandBlo;
import com.example.demo.blo.interfaces.domain.IPaymentMethodBlo;
import com.example.demo.entity.domain.Brand;
import com.example.demo.entity.domain.PaymentMethod;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "api/payment-method")
public class PaymentMethodRest extends BaseRest<PaymentMethod, Integer> {

    private final IPaymentMethodBlo paymentMethodBlo;

    /**
     * Inject blo
     *
     * @param paymentMethodBlo interfaz blo
     */
    public PaymentMethodRest(IPaymentMethodBlo paymentMethodBlo) {
        super(paymentMethodBlo);
        this.paymentMethodBlo = paymentMethodBlo;
    }


}
