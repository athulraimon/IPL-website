package com.ipl.teams;

import jakarta.persistence.*;

@Entity
@Table(name="teams")

public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable=false, unique=true, length=45)
    private String name;
    @Column(nullable=false, unique=true, length=45)
    private String logo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
