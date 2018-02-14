package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IAccounAccessDao;
import com.example.demo.dao.interfaces.common.IBuyProductDao;
import com.example.demo.entity.common.AccountAccess;
import com.example.demo.entity.common.BuyProduct;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class BuyProductDao extends BaseDao<BuyProduct, Integer> implements IBuyProductDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public BuyProductDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
