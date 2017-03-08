package com.general.util;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by joanna on 1/3/17.
 */
@Repository
public class HibernateUtil {
    @Autowired
    private SessionFactory sessionFactory;
    public <T> Serializable create(final T entity){
        return sessionFactory.getCurrentSession().save(entity);
    }
    public <T> T update(final T entity){
        sessionFactory.getCurrentSession().update(entity);
        return entity;
    }
    private <T> void delete(final T entity){
        sessionFactory.getCurrentSession().delete(entity);
    }
    public  <T> void delete(Serializable id, Class<T> entityClass){
        T entity=fetchById(id,entityClass);
        delete(entity);
    }

    public  <T> T fetchById(Serializable id, Class<T> entityClass) {
        return (T) sessionFactory.getCurrentSession().get(entityClass,id);
    }

    public  <T> List<T> fetchAll(Class<T> entityClass) {
        return sessionFactory.getCurrentSession().createQuery(" FROM "+entityClass.getName()).list();
    }
    public <T> List fetchAll(String SQL){
        return sessionFactory.getCurrentSession().createSQLQuery(SQL).list();
    }
    public <T> List fetchAll(String HQL,Class<T> entityClass){
        System.out.println(HQL);
        Query query=sessionFactory.getCurrentSession().createQuery(HQL);
        return query.list();
    }

}
