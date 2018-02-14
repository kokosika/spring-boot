package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IBuyProductCalendarDao;
import com.example.demo.dao.interfaces.common.IBuyProductDao;
import com.example.demo.entity.common.BuyProduct;
import com.example.demo.entity.common.BuyProductCalendar;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class BuyProductCalendarDao extends BaseDao<BuyProductCalendar, Integer> implements IBuyProductCalendarDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public BuyProductCalendarDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
