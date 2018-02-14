package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IInventoryCalendarBlo;
import com.example.demo.dao.interfaces.common.IInventoryCalendarDao;
import com.example.demo.entity.common.InventoryCalendar;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class InventoryCalendarBlo extends BaseBlo<InventoryCalendar, Integer> implements IInventoryCalendarBlo {

    private final IInventoryCalendarDao inventoryCalendarDao;

    /**
     * Inject dao
     *
     * @param inventoryCalendarDao base dao
     */
    public InventoryCalendarBlo(IInventoryCalendarDao inventoryCalendarDao) {
        super(inventoryCalendarDao);
        this.inventoryCalendarDao = inventoryCalendarDao;
    }
}
