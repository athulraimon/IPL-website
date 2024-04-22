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