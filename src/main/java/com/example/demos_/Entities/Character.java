package com.example.demos_.Entities;

import jakarta.persistence.*;


@Entity
@Table(name= "characters")
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "character_seq", sequenceName = "character_sequence", initialValue = 100, allocationSize = 1)
    private Long Id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String race;
    @Column(nullable = false)
    private String ki;
    @Column(nullable = false)
    private String maxKi;
    @Column(columnDefinition = "TEXT",nullable = false)
    private String image;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    // Getters and Setters
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRace() {
        return race;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public String getKi() {
        return ki;
    }
    public void setKi(String ki) {
        this.ki = ki;
    }
    public String getMaxKi() {
        return maxKi;
    }
    public void setMaxKi(String maxKi) {
        this.maxKi = maxKi;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
