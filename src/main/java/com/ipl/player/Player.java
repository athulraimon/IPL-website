package com.ipl.player;

import jakarta.persistence.*;

@Entity
@Table(name="players")

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable=false, unique=true, length=45)
    private String name;

    @Column(nullable=false, unique=true, length=45)
    private String teamName;

    @Column
    private Integer age;

    @Column
    private String role;

    @Column
    private Integer matchesPlayed;

    @Column
    private Integer runs;

    @Column
    private Integer wickets;

    @Column
    private Integer average;

    @Column
    private Double economy;


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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getRuns() {
        return runs;
    }

    public void setRuns(Integer runs) {
        this.runs = runs;
    }

    public Integer getWickets() {
        return wickets;
    }

    public void setWickets(Integer wickets) {
        this.wickets = wickets;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    public Double getEconomy() {
        return economy;
    }

    public void setEconomy(Double economy) {
        this.economy = economy;
    }
}