package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IInventoryDao;
import com.example.demo.entity.common.Inventory;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class InventoryDao extends BaseDao<Inventory, Integer> implements IInventoryDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public InventoryDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
