package com.gdsc.game.domain;

import jakarta.persistence.*;

@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int healthPoint;
    private int manaPoint;
    private int defense;

    @Enumerated(EnumType.STRING)
    private Job job;

    protected Character() {}

    public Character(String name, int healthPoint, int manaPoint) {
        this(name, healthPoint, manaPoint, 0);
    }

    public Character(String name, int healthPoint, int manaPoint, int defense) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.defense = defense;
    }


    public void takeDamage(int damage) {
        int actualDamage = Math.max(0, damage - defense);
        this.healthPoint = Math.max(0, healthPoint - damage);
        this.defense = 0;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void useMana(int amount) {
        if (amount > manaPoint) {
            throw new IllegalStateException("마나부족");
        }
        this.manaPoint -= amount;
    }

    public boolean isAlive() {
        return healthPoint > 0;
    }

    public Character(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public Long getId() {
        return id;
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

    public int getDefense() {
        return defense;
    }

    public Job getJob() {
        return job;
    }
}
