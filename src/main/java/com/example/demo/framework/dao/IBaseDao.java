/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.framework.dal;

import java.io.Serializable;
import java.util.Collection;

/**
 * Interfas for generic dao with class patten
 * @author fecalderon
 * @param <T> Entity class
 * @param <ID> Entity id
 */
public interface IBaseDao<T,ID extends Serializable> {
    /**
     * Method for save register in the data base
     * @param entity class object T 
     * @throws java.lang.Exception 
    */
    public void save(T entity) throws Exception;
    
    /**
     * Method for update register in the data base
     * @param entity class object T 
     * @throws java.lang.Exception 
     */
    public void update(T entity) throws Exception ;

    /**
     * Method for delete register in the data base
     * @param entity class object T 
     * @throws java.lang.Exception 
     */
    public void delete(T entity) throws Exception ;

    /**
     * Method for delete register in the data base
     * @param id class id object T 
     * @throws java.lang.Exception 
     */
    public void delete(ID id) throws Exception ;
    
    /**
     * Method for return all register in the data base
     * @return List T
     * @throws Exception 
     */
    public Collection<T> findAll() throws Exception;
    
    /**
     * Method for find register in the data base with yours id
     * @param id id object T 
     * @return object t
     * @throws Exception 
     */
    public T findByKey(Integer id) throws Exception;
}
