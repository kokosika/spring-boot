package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IStoreBlo;
import com.example.demo.dao.interfaces.common.IStoreDao;
import com.example.demo.entity.common.Store;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class StoreBlo extends BaseBlo<Store, Integer> implements IStoreBlo {

    private final IStoreDao storeDao;

    /**
     * Inject dao
     *
     * @param storeDao base dao
     */
    public StoreBlo(IStoreDao storeDao) {
        super(storeDao);
        this.storeDao = storeDao;
    }
}
