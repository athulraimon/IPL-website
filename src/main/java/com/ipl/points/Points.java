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
    @Column(nullable=false, unique=true, length=45)
    private String logo;

    @Column
    private Integer won;

    @Column
    private Integer lost;

    @Column
    private Float nrr;

    @Column
    private Integer points;
}
