package com.example.demo.dao.dao.common;

import com.example.demo.dao.interfaces.common.IInventoryCalendarDao;
import com.example.demo.entity.common.InventoryCalendar;
import com.example.demo.framework.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableAutoConfiguration
@Transactional
public class InventoryCalendarDao extends BaseDao<InventoryCalendar, Integer> implements IInventoryCalendarDao {
    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public InventoryCalendarDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
