package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IBuyProductBlo;
import com.example.demo.blo.interfaces.common.IBuyProductCalendarBlo;
import com.example.demo.entity.common.BuyProduct;
import com.example.demo.entity.common.BuyProductCalendar;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/buy-product-calendar")
public class BuyProductCalendarRest extends BaseRest<BuyProductCalendar, Integer> {

    private final IBuyProductCalendarBlo buyProductCalendarBlo;

    /**
     * Inject blo
     *
     * @param buyProductCalendarBlo interfaz blo
     */
    public BuyProductCalendarRest(IBuyProductCalendarBlo buyProductCalendarBlo) {
        super(buyProductCalendarBlo);
        this.buyProductCalendarBlo = buyProductCalendarBlo;
    }
}
