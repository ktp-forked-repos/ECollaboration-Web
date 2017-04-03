package com.general.dao;

import com.general.util.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by joanna on 1/5/17.
 */
@Repository
public class EntityDAOImpl  implements EntityDAO{
    @Autowired
    private HibernateUtil hibernateUtil;
    @Override
    public <T> long createEntity(T entity) {
        Serializable serializable=hibernateUtil.create(entity);
        if(serializable instanceof Long)
            return (Long)serializable;
        else
            return -1;//which means the generated indentifier is a combination of many keys

    }

    @Override
    public <T> T updateEntity(T entity) {
        return hibernateUtil.update(entity);
    }

    @Override
    public <T> void deleteEntity(int id, Class<T> entityClass) {
        hibernateUtil.delete(id,entityClass);
    }

    @Override
    public <T> List<T> getAllEntities(Class<T> entityClass) {
        return hibernateUtil.fetchAll(entityClass);
    }

    @Override
    public <T> List<T> getAllEntities(String HQL, Class<T> entityClass) {
        return hibernateUtil.fetchAll(HQL,entityClass);
    }

    @Override
    public <T> T getEntity(int id, Class<T> entityClass) {
        return hibernateUtil.fetchById(id,entityClass);
    }
}
