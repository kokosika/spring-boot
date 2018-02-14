package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IBuyProductBlo;
import com.example.demo.blo.interfaces.common.IBuyProductCalendarBlo;
import com.example.demo.dao.interfaces.common.IBuyProductCalendarDao;
import com.example.demo.dao.interfaces.common.IBuyProductDao;
import com.example.demo.entity.common.BuyProduct;
import com.example.demo.entity.common.BuyProductCalendar;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class BuyProductCalendarBlo extends BaseBlo<BuyProductCalendar, Integer> implements IBuyProductCalendarBlo {

    private final IBuyProductCalendarDao buyProductCalendarDao;

    /**
     * Inject dao
     *
     * @param buyProductCalendarDao base dao
     */
    public BuyProductCalendarBlo(IBuyProductCalendarDao buyProductCalendarDao) {
        super(buyProductCalendarDao);
        this.buyProductCalendarDao = buyProductCalendarDao;
    }
}
