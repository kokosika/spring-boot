package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IInventoryTimeBlo;
import com.example.demo.dao.interfaces.common.IInventoryTimeDao;
import com.example.demo.entity.common.InventoryTime;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class InvetoryTimeBlo extends BaseBlo<InventoryTime, Integer> implements IInventoryTimeBlo {

    private final IInventoryTimeDao inventoryTimeDao;

    /**
     * Inject dao
     *
     * @param inventoryTimeDao base dao
     */
    public InvetoryTimeBlo(IInventoryTimeDao inventoryTimeDao) {
        super(inventoryTimeDao);
        this.inventoryTimeDao = inventoryTimeDao;
    }
}
