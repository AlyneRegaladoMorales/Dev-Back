package com.example.demos_.Entities;

import jakarta.persistence.*;



@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "character_id", nullable = false)
    private Long characterId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String comment;

    @Column(nullable = false)
    private String authorName;

    @Column(nullable = false)
    private String email;

    @Column(nullable = true)
    private String country;

    @Column(nullable = true)
    private Integer age;


    public Long getId() {
        return id;
    }

    public Long getCharacterId() {
        return characterId;
    }

    public String getComment() {
        return comment;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getEmail() {
        return email;
    }


    public String getCountry() {
        return country;
    }


    public Integer getAge() {
        return age;
    }



    // --- Setters ---

    public void setId(Long id) {
        this.id = id;
    }

    public void setCharacterId(Long personId) {
        this.characterId = personId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }


}