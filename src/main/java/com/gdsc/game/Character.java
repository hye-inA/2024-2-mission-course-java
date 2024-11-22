package com.gdsc.game;

public class Character {
    private final String name;
    private int healthPoint;
    private int manaPoint;

    private int defense;

    public Character(String name, int healthPoint, int manaPoint, int defense) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.defense = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getManaPoint() {
        return manaPoint;
    }

}
