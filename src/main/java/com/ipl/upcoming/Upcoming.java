package com.ipl.upcoming;

import jakarta.persistence.*;

@Entity
@Table(name="upcoming")
public class Upcoming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String teamOne;

    @Column
    private String logoOne;

    @Column
    private String teamTwo;

    @Column
    private String logoTwo;

    @Column
    private String venue;

    @Column(nullable=false, unique=true, length=45)
    private String date;

    @Column
    private Integer price;

    // Private constructor to prevent direct instantiation
    private Upcoming() {}

    // Builder pattern to create Upcoming objects
    public static class Builder {
        private String teamOne;
        private String logoOne;
        private String teamTwo;
        private String logoTwo;
        private String venue;
        private String date;
        private Integer price;

        public Builder teamOne(String teamOne) {
            this.teamOne = teamOne;
            return this;
        }

        public Builder logoOne(String logoOne) {
            this.logoOne = logoOne;
            return this;
        }

        public Builder teamTwo(String teamTwo) {
            this.teamTwo = teamTwo;
            return this;
        }

        public Builder logoTwo(String logoTwo) {
            this.logoTwo = logoTwo;
            return this;
        }

        public Builder venue(String venue) {
            this.venue = venue;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder price(Integer price) {
            this.price = price;
            return this;
        }

        public Upcoming build() {
            Upcoming upcoming = new Upcoming();
            upcoming.teamOne = this.teamOne;
            upcoming.logoOne = this.logoOne;
            upcoming.teamTwo = this.teamTwo;
            upcoming.logoTwo = this.logoTwo;
            upcoming.venue = this.venue;
            upcoming.date = this.date;
            upcoming.price = this.price;
            return upcoming;
        }
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeamOne() {
        return teamOne;
    }

    public void setTeamOne(String teamOne) {
        this.teamOne = teamOne;
    }

    public String getLogoOne() {
        return logoOne;
    }

    public void setLogoOne(String logoOne) {
        this.logoOne = logoOne;
    }

    public String getTeamTwo() {
        return teamTwo;
    }

    public void setTeamTwo(String teamTwo) {
        this.teamTwo = teamTwo;
    }

    public String getLogoTwo() {
        return logoTwo;
    }

    public void setLogoTwo(String logoTwo) {
        this.logoTwo = logoTwo;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}