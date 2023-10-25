package org.example.dao;

public interface Dao <T>{

    void save(T entity);
    void update(T entity);
    void delete(T entity);
}
