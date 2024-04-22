package com.ipl.upcoming;
import jakarta.persistence.*;

@Entity
@Table(name="upcoming")

public class Upcoming {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable=false, unique=true, length=45)
    private String teamOne;
    @Column(nullable=false, unique=true, length=45)
    private String logoOne;

    @Column(nullable=false, unique=true, length=45)
    private String teamTwo;
    @Column(nullable=false, unique=true, length=45)
    private String logoTwo;

    @Column(nullable=false, unique=true, length=45)
    private String venue;
    @Column(nullable=false, unique=true, length=45)
    private String date;
}
