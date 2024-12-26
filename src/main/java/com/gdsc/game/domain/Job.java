package com.gdsc.game.domain;

import com.gdsc.game.exception.GameException;

import java.util.Arrays;
import java.util.List;

import static com.gdsc.game.exception.ErrorCode.JOB_NOT_FOUND;

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

    public int calculateHealth(int level) {
        return health + (level * 10);
    }

    public int calculateMana(int level) {
        return mana + (level * 5);
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

    public static Job fromString(String value) {
        try {
            return Job.valueOf(value.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new GameException(JOB_NOT_FOUND, "존재하지 않는 직업입니링: " + value);
        }
    }


}
