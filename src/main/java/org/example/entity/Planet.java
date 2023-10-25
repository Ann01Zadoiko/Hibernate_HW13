package org.example.entity;

import jakarta.persistence.*;
import java.util.List;

@Table(name = "planets")
@Entity
public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", length = 500)
    private String name;

    @OneToMany(mappedBy = "planets")
    private List<Ticket> toPlanetIds;

    @OneToMany(mappedBy = "planets")
    private List<Ticket> fromPlanetIds;

    public Planet(){}

    public Planet(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ticket> getToPlanetIds() {
        return toPlanetIds;
    }

    public void setToPlanetIds(List<Ticket> toPlanetIds) {
        this.toPlanetIds = toPlanetIds;
    }

    public List<Ticket> getFromPlanetIds() {
        return fromPlanetIds;
    }

    public void setFromPlanetIds(List<Ticket> fromPlanetIds) {
        this.fromPlanetIds = fromPlanetIds;
    }
}
