package com.gdsc.game;

import java.util.Random;

public abstract class Action {
    protected final String name;

    public Action(String name) {
        this.name = name;
    }
}

// 공격
public class AttackAction extends Action {
    private static final int MIN_DAMAGE = 1;
    private static final int MAX_DAMAGE = 10;
    private final Random random = new Random();

}

// 방어
public class DefenseAction extends Action {
    private static final int MIN_DEFENSE = 1;
    private static final int MAX_DEFENSE = 10;
    private final Random random = new Random();

}

// 스킬
public abstract class SkillAction extends Action {
    protected final int manaCost;
    protected final int coolTime;
    protected int remainingCooltime;
    protected final Random random = new Random();

    public SkillAction(String name, int manaCost, int coolTime) {
        super(name);
        this.manaCost = manaCost;
        this.coolTime = coolTime;
        this.remainingCooltime = 0;
    }

}


public class cutTwice extends SkillAction {
    private static final int MIN_MULTIPLIER = 2;
    private static final int MAX_MULTIPLIER = 20;

}

public class cutThreeTimes extends SkillAction {
    private static final int MIN_MULTIPLIER = 3;
    private static final int MAX_MULTIPLIER = 30;

}

public class PowerStrikeSkill extends SkillAction {
    private static final int MIN_MULTIPLIER = 5;
    private static final int MAX_MULTIPLIER = 50;

}