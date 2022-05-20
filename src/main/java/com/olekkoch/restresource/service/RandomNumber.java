package com.olekkoch.restresource.service;

public class RandomNumber {
    private int id;
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
