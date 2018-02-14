package com.example.demo.api.common;

import com.example.demo.blo.interfaces.common.IStockBlo;
import com.example.demo.entity.common.Stock;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/stock")
public class StockRest extends BaseRest<Stock, Integer> {

    private final IStockBlo stockBlo;

    /**
     * Inject blo
     *
     * @param stockBlo interfaz blo
     */
    public StockRest(IStockBlo stockBlo) {
        super(stockBlo);
        this.stockBlo = stockBlo;
    }
}
