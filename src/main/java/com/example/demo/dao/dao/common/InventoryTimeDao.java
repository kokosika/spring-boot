package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IInventoryTimeDao;
import com.example.demo.entity.common.InventoryTime;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class InventoryTimeDao extends BaseDao<InventoryTime, Integer> implements IInventoryTimeDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public InventoryTimeDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
