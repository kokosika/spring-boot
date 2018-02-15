package com.example.demo.api.rest.common;


import com.example.demo.blo.interfaces.common.IInventoryTimeBlo;
import com.example.demo.entity.common.InventoryTime;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/inventory-time")
public class InventoryTimeRest extends BaseRest<InventoryTime, Integer> {

    private final IInventoryTimeBlo inventoryTimeBlo;

    /**
     * Inject blo
     *
     * @param inventoryTimeBlo interfaz blo
     */
    public InventoryTimeRest(IInventoryTimeBlo inventoryTimeBlo) {
        super(inventoryTimeBlo);
        this.inventoryTimeBlo = inventoryTimeBlo;
    }
}
