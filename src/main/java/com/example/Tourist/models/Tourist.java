package com.example.Tourist.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Tourist {
    // ce la database de tourist
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;

    private String lastName;

    private int age;

    private int passportID;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn
    private List<Site> visitedSites;



}
