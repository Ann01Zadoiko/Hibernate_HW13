package org.example.service;

import org.example.entity.Client;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClientCrudServiceTest {

    @Test
    void save() {
        ClientCrudService clientCrudService = new ClientCrudService();
        Client client = new Client();
        client.setName("Mr. Chocolate");
        clientCrudService.save(client);
        assertEquals("Client{id=22, name='Mr. Chocolate'}", client.toString());
    }

    @Test
    void findById() {
        ClientCrudService clientCrudService = new ClientCrudService();
        Client client = clientCrudService.findById(1L);
        assertEquals("Edward Reid", client.getName());
    }

    @Test
    void update() {
        ClientCrudService clientCrudService = new ClientCrudService();
        Client client = clientCrudService.findById(22L);
        client.setName("Ms. Chocolate");
        clientCrudService.update(client);
        assertEquals("Ms. Chocolate", client.getName());
    }

    @Test
    void delete() {
        ClientCrudService clientCrudService = new ClientCrudService();
        Client client = clientCrudService.findById(22L);
        clientCrudService.delete(client);
    }
}