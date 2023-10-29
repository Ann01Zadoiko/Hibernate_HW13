package org.example.service;

import org.example.entity.Planet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PlanetCrudServiceTest {

    @Test
    void save() {
        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet planet = new Planet();
        planet.setId("MER");
        planet.setName("Mercury");
        planetCrudService.save(planet);
        assertEquals("Mercury", planet.getName());
    }

    @Test
    void findById() {
        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet planet = planetCrudService.findById("VEN");
        assertEquals("JUST Mars", planet.getName());
    }

    @Test
    void update() {
        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet planet = planetCrudService.findById("MER");
        planet.setName("Just Mercury");
        planetCrudService.update(planet);
        assertEquals("Just Mercury", planet.getName());
    }

    @Test
    void delete() {
        PlanetCrudService planetCrudService = new PlanetCrudService();
        Planet planet = planetCrudService.findById("MER");
        planetCrudService.delete(planet);
    }
}