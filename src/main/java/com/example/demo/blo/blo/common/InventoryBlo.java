package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IInventoryBlo;
import com.example.demo.dao.interfaces.common.IInventoryDao;
import com.example.demo.entity.common.Inventory;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class InventoryBlo extends BaseBlo<Inventory, Integer> implements IInventoryBlo {

    private final IInventoryDao inventoryDao;

    /**
     * Inject dao
     *
     * @param inventoryDao base dao
     */
    public InventoryBlo(IInventoryDao inventoryDao) {
        super(inventoryDao);
        this.inventoryDao = inventoryDao;
    }
}
