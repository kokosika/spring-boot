/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.framework.dal;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Class for generic dao with class patten
 * @author fecalderon
 * @param <T> Entity class
 * @param <ID> Entity id
 */
@Repository
@EnableAutoConfiguration
@Transactional
public class BaseDao <T,ID extends Serializable> implements IBaseDao<T,ID>{
    /**
     * Instance for session factory the hibernate
     */
    protected SessionFactory sessionFactory;

    /**
     * Create the new instance for session factory injection
     * @param sessionFactory session factory hibernate interface
     */    
    public BaseDao(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    /**
     * Close the session if is open 
     * @param session current session
     */
    public void closeSession(Session session){
        if(session.isOpen())
            session.close();
    }
    
    /**
     * Return generict entity class for manipulation
     * @return T class
     */
    @SuppressWarnings("unchecked")
    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
    
    
    /**
     * Method for save register in the data base
     * @param entity class object T 
     * @throws java.lang.Exception 
    */
    @Override
    public void save(T entity) throws Exception {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            closeSession(session);
        }
    }
    
    /**
     * Method for update register in the data base
     * @param entity class object T 
     * @throws java.lang.Exception 
     */
    @Override
    public void update(T entity) throws Exception {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Method for delete register in the data base
     * @param entity class object T 
     * @throws java.lang.Exception 
     */
    @Override
    public void delete(T entity) throws Exception{
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            closeSession(session);
        }
    }

    /**
     * Method for delete register in the data base
     * @param id class id object T 
     * @throws java.lang.Exception 
     */
    @Override
    public void delete(ID id) throws Exception{
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            T entity = session.get(getEntityClass(), id);
            if(entity == null)
                throw new Exception("No data found");
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            closeSession(session);
        }
    }
    
    /**
     * Method for return all register in the data base
     * @return List T
     * @throws Exception 
     */
    @Override
    public Collection<T> findAll() throws Exception{
        Session session = sessionFactory.openSession();
        try {
            return session.createCriteria(getEntityClass()).list();
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            closeSession(session);
        }
    }
    
    /**
     * Method for find register in the data base with yours id
     * @param id id object T 
     * @return object t
     * @throws Exception 
     */
    @Override
    public T findByKey(Integer id) throws Exception{
        Session session = sessionFactory.openSession();
        try {
            return (T) session.createCriteria(getEntityClass())
                    .add(Restrictions.eq("id", id))
                    .list().get(0);
        } catch (Exception e) {
            throw new Exception(e);
        } finally {
            closeSession(session);
        }
    }
}
