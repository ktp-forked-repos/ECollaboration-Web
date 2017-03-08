package com.general.dao;

import java.util.List;

/**
 * Created by joanna on 1/5/17.
 */
public interface EntityDAO {
    public <T> long createEntity(T entity);
    public <T> T updateEntity(T entity);
    public <T> void deleteEntity(int id,Class<T> entityClass);
    public <T> List<T> getAllEntities(Class<T> entityClass);
    public <T> List<T> getAllEntities(String HQL, Class<T> entityClass);
    public <T> T getEntity(int id,Class<T> entityClass);

}
