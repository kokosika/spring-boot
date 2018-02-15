package com.example.demo.api.rest.common;


import com.example.demo.blo.interfaces.common.IStoreBlo;
import com.example.demo.entity.common.Store;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/store")
public class StoreRest extends BaseRest<Store, Integer> {

    private final IStoreBlo storeBlo;

    /**
     * Inject blo
     *
     * @param storeBlo interfaz blo
     */
    public StoreRest(IStoreBlo storeBlo) {
        super(storeBlo);
        this.storeBlo = storeBlo;
    }
}
