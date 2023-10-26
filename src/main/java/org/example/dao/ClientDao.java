package org.example.dao;

import org.example.entity.Client;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientDao implements Dao<Client>{
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    @Override
    public void save(Client entity) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        }
    }


    public Client findById(Long id) {
        try (Session session = sessionFactory.openSession()){
            return session.get(Client.class, id);
        }
    }

    @Override
    public void update(Client entity) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.merge(entity);
            transaction.commit();
        }
    }



    @Override
    public void delete(Client entity) {
        try (Session session = sessionFactory.openSession()){
            Transaction transaction = session.beginTransaction();
            session.remove(entity);
            transaction.commit();
        }
    }
}