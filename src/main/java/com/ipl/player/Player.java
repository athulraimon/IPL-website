package com.ipl.player;



public class Player {
    private String name;
    private int age;
    private String role; // batsman, bowler, all-rounder, etc.
    private String country;

    public Player(String name, int age, String role, String country) {
        this.name = name;
        this.age = age;
        this.role = role;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Add any other methods you need for the Player class
}