package org.example.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client clientId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_planet_id", referencedColumnName = "id")
    private Planet fromPlanetId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_planet_id", referencedColumnName = "id")
    private Planet toPlanetId;

    public Ticket(Long id, Timestamp createdAt, Client clientId, Planet fromPlanetId, Planet toPlanetId) {
        this.id = id;
        this.createdAt = createdAt;
        this.clientId = clientId;
        this.fromPlanetId = fromPlanetId;
        this.toPlanetId = toPlanetId;
    }

    public Ticket(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Client getClientId() {
        return clientId;
    }

    public void setClientId(Client clientId) {
        this.clientId = clientId;
    }

    public Planet getFromPlanetId() {
        return fromPlanetId;
    }

    public void setFromPlanetId(Planet fromPlanetId) {
        this.fromPlanetId = fromPlanetId;
    }

    public Planet getToPlanetId() {
        return toPlanetId;
    }

    public void setToPlanetId(Planet toPlanetId) {
        this.toPlanetId = toPlanetId;
    }
}