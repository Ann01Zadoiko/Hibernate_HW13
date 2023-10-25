package org.example.service;

import org.example.dao.ClientDao;
import org.example.entity.Client;

public class ClientCrudService implements Service<Client>{
    private ClientDao clientDao = new ClientDao();

    @Override
    public void save(Client entity) {
        clientDao.save(entity);
    }

    public Client findById(Long id) {
        return clientDao.findById(id);
    }

    @Override
    public void update(Client entity) {
        clientDao.update(entity);
    }

    @Override
    public void delete(Client entity) {
        clientDao.delete(entity);
    }
}
