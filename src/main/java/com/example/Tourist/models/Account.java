package com.example.Tourist.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate

public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int account_number;
    @Column(nullable = false)
    private long balance;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String employer;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;

    public int getAccount_number() {
        return account_number;
    }

}
