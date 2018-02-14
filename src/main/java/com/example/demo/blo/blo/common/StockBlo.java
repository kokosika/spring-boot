package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IStockBlo;
import com.example.demo.dao.interfaces.common.IStockDao;
import com.example.demo.entity.common.Stock;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class StockBlo extends BaseBlo<Stock, Integer> implements IStockBlo {

    private final IStockDao stockDao;

    /**
     * Inject dao
     *
     * @param stockDao base dao
     */
    public StockBlo(IStockDao stockDao) {
        super(stockDao);
        this.stockDao = stockDao;
    }
}
