package com.gdsc.game.domain;

import java.util.Arrays;
import java.util.List;

public enum Job {
    KNIGHT(100, 50, Arrays.asList("CutTwice", "CutThreeTimes", "PowerStrike")),
    WIZARD(90, 100, Arrays.asList("Recovery", "AttackSpeed", "Stun")),
    ARCHER(80, 80, Arrays.asList("FireShot", "MultipleArrow", "SlowShot"));

    private final int health;
    private final int mana;
    private final List<String> skills;

    Job(int health, int mana, List<String> skills) {
        this.health = health;
        this.mana = mana;
        this.skills = skills;
    }

    public int getHealth() {
        return health;
    }

    public int getMana() {
        return mana;
    }

    public List<String> getSkills() {
        return skills;
    }

}
