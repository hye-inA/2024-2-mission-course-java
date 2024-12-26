package com.gdsc.game.domain;

public class Character {
    private final String name;
    private int healthPoint;
    private int manaPoint;

    private int defense;

    public Character(String name, int healthPoint, int manaPoint) {
      this(name,healthPoint,manaPoint,0);
    }

    public Character(String name, int healthPoint, int manaPoint, int defense) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.defense = defense;
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

    public void setDefense(int defense) {
        this.defense = defense;
    }

<<<<<<< Updated upstream:src/main/java/com/gdsc/game/domain/Character.java

=======
>>>>>>> Stashed changes:src/main/java/com/gdsc/game/Character.java
    public void useMana(int amount) {
        if (amount > manaPoint) {
            throw new IllegalStateException("마나부족");
        }
        this.manaPoint -= amount;
    }
<<<<<<< Updated upstream:src/main/java/com/gdsc/game/domain/Character.java

    public boolean isAlive(){
        return healthPoint >0;
    }


=======
>>>>>>> Stashed changes:src/main/java/com/gdsc/game/Character.java
}
