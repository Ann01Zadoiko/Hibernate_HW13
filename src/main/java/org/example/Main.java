package org.example;

import org.apache.log4j.Logger;

import org.example.data.Migration;
import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.service.ClientCrudService;
import org.example.service.PlanetCrudService;
import org.example.util.HibernateUtil;

import java.io.IOException;
import java.sql.SQLException;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        logger.info("The program started");

        Migration.flywayMigration();

        ClientCrudService clientCrudService = new ClientCrudService();

        Client newClient = new Client();
        newClient.setName("John Doe");
        clientCrudService.save(newClient);

        Client client = clientCrudService.findById(3L);
        System.out.println("Found client: " + client.getName());


        // Оновлюємо Person
        client.setName("Jane Doe");
        clientCrudService.update(client);
        System.out.println("Update client: " + client.getName());

        // Видаляємо Person
        clientCrudService.delete(client);
        System.out.println("The client was deleted");

        HibernateUtil.getInstance().close();




//        ClientCrudService ccs = new ClientCrudService();
//        PlanetCrudService pcs = new PlanetCrudService();
//        Client client = new Client();
//        client.setName("TEST TEST");
//        Client newClient = new Client();
//        newClient.setName("New Earth 10");
//        newClient.setId(12L);
//        ccs.save(client);
//        System.out.println("OLD " + ccs.findById(12L));
//        ccs.update(newClient);
//        System.out.println("NEW " + ccs.findById(12L));
//        ccs.delete(newClient);
//
//        Planet planet = new Planet();
//        Planet planetNew = new Planet();
//        planet.setId("EA2");
//        planet.setName("EART 1");
//        planetNew.setId("EA2");
//        planetNew.setName("New Earth 10");
//        pcs.save(planet);
//        System.out.println("OLD " + pcs.findById("EA1"));
//        pcs.update(planetNew);
//        System.out.println("NEW " + pcs.findById("EA1"));
//        pcs.delete(planetNew);


    }
}
