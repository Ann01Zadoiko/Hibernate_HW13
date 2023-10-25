package org.example.service;

import org.example.dao.PlanetDao;
import org.example.entity.Planet;

public class PlanetCrudService implements Service<Planet>{
    private PlanetDao planetDao = new PlanetDao();

    @Override
    public void save(Planet entity) {
        planetDao.save(entity);
    }

    public Planet findById(String id) {
        return planetDao.findById(id);
    }

    @Override
    public void update(Planet entity) {
        planetDao.update(entity);
    }

    @Override
    public void delete(Planet entity) {
        planetDao.delete(entity);
    }
}
