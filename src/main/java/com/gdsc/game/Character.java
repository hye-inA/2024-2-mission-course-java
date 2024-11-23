package com.gdsc.game;

public class Character {
    private final String name;
    private int healthPoint;
    private int manaPoint;


    public Character(String name, int healthPoint, int manaPoint) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
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

    public void takeDamage(int demage){
        this.healthPoint = Math.max(0, healthPoint - demage);
    }

}
