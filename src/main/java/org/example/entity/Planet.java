package org.example.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "planets")

public class Planet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", length = 500)
    private String name;

    @OneToMany (mappedBy = "fromPlanetId")
    private Set<Ticket> fromPlanetId;

    @OneToMany (mappedBy = "toPlanetId")
    private Set<Ticket> toPlanetId;

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

}
