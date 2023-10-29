package org.example;

import org.example.entity.Planet;
import org.example.service.PlanetCrudService;

public class Main {
    public static void main(String[] args) {
        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet planet = new Planet("MER", "Mercury");
        planetCrudService.save(planet);
    }
}
