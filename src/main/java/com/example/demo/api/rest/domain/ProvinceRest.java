/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.api.rest.domain;

import com.example.demo.blo.interfaces.domain.IProvinceBlo;
import com.example.demo.entity.domain.Province;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fcortez
 */
@RestController
@RequestMapping(value = "/api/province")
public class ProvinceRest extends BaseRest<Province, Integer> {

    private final IProvinceBlo provinceBlo;

    /**
     * @param provinceBlo
     */
    public ProvinceRest(IProvinceBlo provinceBlo) {
        super(provinceBlo);
        this.provinceBlo = provinceBlo;
    }

}
