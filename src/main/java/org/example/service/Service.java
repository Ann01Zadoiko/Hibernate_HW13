package org.example.service;

public interface Service <T>{

    void save(T entity);
    void update(T entity);
    void delete(T entity);
}
