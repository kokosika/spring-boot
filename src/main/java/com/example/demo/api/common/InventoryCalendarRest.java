package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IInventoryCalendarBlo;
import com.example.demo.entity.common.InventoryCalendar;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/inventory-calendar")
public class InventoryCalendarRest extends BaseRest<InventoryCalendar, Integer> {

    private final IInventoryCalendarBlo inventoryCalendarBlo;

    /**
     * Inject blo
     *
     * @param inventoryCalendarBlo interfaz blo
     */
    public InventoryCalendarRest(IInventoryCalendarBlo inventoryCalendarBlo) {
        super(inventoryCalendarBlo);
        this.inventoryCalendarBlo = inventoryCalendarBlo;
    }
}
