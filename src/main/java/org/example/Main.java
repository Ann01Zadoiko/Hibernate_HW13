package org.example;

import org.apache.log4j.Logger;

import org.example.data.Migration;
import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.service.ClientCrudService;
import org.example.service.PlanetCrudService;
import org.example.util.HibernateUtil;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
            logger.info("The program started");

            Migration.flywayMigration();

            //client
            ClientCrudService clientCrudService = new ClientCrudService();

            Client newClient = new Client();
            newClient.setName("John Doe");
            clientCrudService.save(newClient);

            Client client = clientCrudService.findById(3L);
            logger.info("Found client: " + client.getName());

            client.setName("Jane Doe");
            clientCrudService.update(client);
            logger.info("Update client: " + client.getName());

            Client deleteClient = clientCrudService.findById(5L);
            clientCrudService.delete(deleteClient);

            //planet
            PlanetCrudService planetCrudService = new PlanetCrudService();

            Planet newPlanet = new Planet();
            newPlanet.setId("MAR");
            newPlanet.setName("Mars");

            Planet planet = planetCrudService.findById("VEN");
            logger.info("Found planet: " + planet.getName());

            planet.setName("JUST Mars");
            planetCrudService.update(planet);
            logger.info("Update planet: " + planet.getName());

            Planet deletePlanet = planetCrudService.findById("EAR");
            clientCrudService.delete(deleteClient);

            HibernateUtil.getInstance().close();

    }
}
