package org.example.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String description;
    private Double prix;

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
}


