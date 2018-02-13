package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IInventoryBlo;
import com.example.demo.entity.common.Inventory;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/inventory")
public class InventoryRest extends BaseRest<Inventory, Integer> {

    private final IInventoryBlo inventoryBlo;

    /**
     * Inject blo
     *
     * @param inventoryBlo interfaz blo
     */
    public InventoryRest(IInventoryBlo inventoryBlo) {
        super(inventoryBlo);
        this.inventoryBlo = inventoryBlo;
    }
}
