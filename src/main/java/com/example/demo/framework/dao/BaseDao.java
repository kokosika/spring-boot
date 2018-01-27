/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.framework.dao;

import com.example.demo.framework.dto.ParameterDto;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.procedure.ProcedureCall;
import org.hibernate.result.Output;
import org.hibernate.result.ResultSetOutput;

import javax.persistence.ParameterMode;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class for generic dao with class patten
 *
 * @param <T>  Entity class
 * @param <ID> Entity id
 * @author fecalderon
 */
public class BaseDao<T, ID extends Serializable> implements IBaseDao<T, ID> {
    /**
     * Instance for session factory the hibernate
     */
    protected SessionFactory sessionFactory;

    /**
     * Create the new instance for session factory injection
     *
     * @param sessionFactory session factory hibernate interface
     */
    public BaseDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Close the session if is open
     *
     * @param session current session
     */
    public void closeSession(Session session) {
        if (session.isOpen())
            session.close();
    }

    /**
     * Return generic entity class for manipulation
     *
     * @return T class
     */
    @SuppressWarnings("unchecked")
    private Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * @param params
     * @return
     */
    protected List<T> executeJpa(List<ParameterDto> params) {
        Session session = sessionFactory.openSession();
        try {
            Criteria criteria = session.createCriteria(getEntityClass());
            if (!params.isEmpty()) {
                for (ParameterDto param : params) {
                    criteria.add(Restrictions.eq(param.getName(), param.getData()));
                }
            }
            return criteria.list();
        } catch (Exception ex) {
            return null;
        } finally {
            closeSession(session);
        }
    }

    /**
     * @return
     */
    protected List<T> executeJpa() {
        Session session = sessionFactory.openSession();
        try {
            Criteria criteria = session.createCriteria(getEntityClass().getName());
            return (List<T>) criteria.list();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            return null;
        } finally {
            closeSession(session);
        }
    }

    /**
     * call store procedure for ref curso output
     *
     * @param procedure
     * @return list
     */
    protected List<T> executeProcedure(String procedure) {
        Session session = sessionFactory.openSession();
        String storeProcedure = procedure;//getContext()+"."+ procedure;
        try {
            ProcedureCall procedureCall = session.createStoredProcedureCall(storeProcedure);
            procedureCall.registerParameter(1, void.class, ParameterMode.REF_CURSOR);
            Output out = procedureCall.getOutputs().getCurrent();
            if (out.isResultSet()) {
                List<T> result = (List<T>) ((ResultSetOutput) out).getResultList();
                return result;
            }
            return null;
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeSession(session);
        }
    }

    /**
     * @param procedure name procedure
     * @param params    param
     * @param <Y>       dto
     * @return list
     */
    protected <Y> List<Y> executeProcedure(String procedure, List<ParameterDto> params) {
        Session session = sessionFactory.openSession();
        String storeProcedure = procedure; //getContext()+"."+ procedure;
        int cont = 0;
        try {
            ProcedureCall procedureCall = session.createStoredProcedureCall(storeProcedure);
            if (!params.isEmpty()) {
                for (ParameterDto param : params) {
                    procedureCall.registerParameter(param.getName(), Object.class, ParameterMode.IN).bindValue(param.getData());
                    cont++;
                }
            }
            procedureCall.registerParameter(cont, void.class, ParameterMode.REF_CURSOR);
            Output out = procedureCall.getOutputs().getCurrent();
            if (out.isResultSet()) {
                List<Y> result = ((ResultSetOutput) out).getResultList();
                return result;
            }
            return null;
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeSession(session);
        }
    }

    /**
     * @param procedure name procedure
     * @param params    param
     */
    protected void executeDirect(String procedure, List<ParameterDto> params) {
        Session session = sessionFactory.openSession();
        String storeProcedure = procedure; //getContext()+"."+ procedure;
        int cont = 0;
        try {
            ProcedureCall procedureCall = session.createStoredProcedureCall(storeProcedure);
            if (!params.isEmpty()) {
                for (ParameterDto param : params) {
                    procedureCall.registerParameter(param.getName(), Object.class, ParameterMode.IN).bindValue(param.getData());
                    cont++;
                }
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeSession(session);
        }
    }

    /**
     * @param procedure name procedure
     */
    protected void executeDirect(String procedure) {
        Session session = sessionFactory.openSession();
        String storeProcedure = procedure; //getContext()+"."+ procedure;
        int cont = 0;
        try {
            ProcedureCall procedureCall = session.createStoredProcedureCall(storeProcedure);
        } catch (Exception ex) {
            throw ex;
        } finally {
            closeSession(session);
        }
    }


    /**
     * @param entity
     * @throws Exception
     */
    @Override
    public void save(T entity) throws Exception {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        } finally {
            closeSession(session);
        }
    }

    /**
     * @param entity
     * @throws Exception
     */
    @Override
    public void update(T entity) throws Exception {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        } finally {
            closeSession(session);
        }
    }

    /**
     * @param id
     * @throws Exception
     */
    @Override
    public void delete(ID id) throws Exception {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            T entity = session.get(getEntityClass(), id);
            if (entity == null)
                throw new Exception("No data Found");
            session.delete(entity);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        } finally {
            closeSession(session);
        }
    }

    /**
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public T findByKey(ID id) throws Exception {
        ArrayList<ParameterDto> param = new ArrayList<>();
        param.add(new ParameterDto("id", id));
        try {
            try {
                return executeJpa(param).get(0);
            } catch (Exception ex) {
                return null;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public Collection<T> findAll() throws Exception {
        try {
            return executeJpa();
        } catch (Exception ex) {
            throw new Exception(ex);
        }
    }

}
