package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IBuyProductDetailDao;
import com.example.demo.entity.common.BuyProductDetail;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class BuyProductDetailDao extends BaseDao<BuyProductDetail, Integer> implements IBuyProductDetailDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public BuyProductDetailDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
