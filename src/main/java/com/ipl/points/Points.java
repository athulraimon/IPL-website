package com.ipl.points;
import jakarta.persistence.*;

@Entity
@Table(name="points")

public class Points {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable=false, unique=true, length=45)
    private String teamName;
    @Column
    private String logo;

    @Column
    private Integer won;

    @Column
    private Integer lost;

    @Column
    private Float nrr;

    @Column
    private Integer points;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Integer getWon() {
        return won;
    }

    public void setWon(Integer won) {
        this.won = won;
    }

    public Integer getLost() {
        return lost;
    }

    public void setLost(Integer lost) {
        this.lost = lost;
    }

    public Float getNrr() {
        return nrr;
    }

    public void setNrr(Float nrr) {
        this.nrr = nrr;
    }
}
