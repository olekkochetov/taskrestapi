package com.olekkoch.restresource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="random_numbers")
public class RandomNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="random")
    private int random;

    public RandomNumber(int id, int random) {
        this.id = id;
        this.random = random;
    }

    public int getId() {
        return this.id;
    }

    public int getRandom() {
        return this.random;
    }

}
