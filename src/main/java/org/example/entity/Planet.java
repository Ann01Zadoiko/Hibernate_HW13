package org.example.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "planets")

public class Planet {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name", length = 500)
    private String name;


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
