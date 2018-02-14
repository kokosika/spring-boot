package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IStockDao;
import com.example.demo.entity.common.Stock;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class StockDao extends BaseDao<Stock, Integer> implements IStockDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public StockDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
