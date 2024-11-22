# 턴제 게임

### 객체 설계
1. 캐릭터 (Character)
2. 행동 (Action)

~~~mermaid
classDiagram
    class Character {
        -String name 
        -int healthPoint
        -int manaPoint
        -int defense
    }

    class Action {
        #String name
    }

    class AttackAction {
        -int MIN_DAMAGE
        -int MAX_DAMAGE
        -Random random
    }

    class DefenseAction {
        -int MIN_DEFENSE
        -int MAX_DEFENSE
        -Random random
    }

    class SkillAction {
        #int manaCost
        #int coolTime
        #int remainingCooltime
        #Random random
    }

    class CutTwice {
        -int MIN_MULTIPLIER
        -int MAX_MULTIPLIER
        -int MANA_COST
        -int COOL_TIME
    }

    class CutThreeTimes {
        -int MIN_MULTIPLIER
        -int MAX_MULTIPLIER
        -int MANA_COST
        -int COOL_TIME
    }

    class PowerStrikeSkill {
        -int MIN_MULTIPLIER
        -int MAX_MULTIPLIER
        -int MANA_COST
        -int COOL_TIME
    }

    Action <|-- AttackAction
    Action <|-- DefenseAction
    Action <|-- SkillAction
    SkillAction <|-- CutTwice
    SkillAction <|-- CutThreeTimes
    SkillAction <|-- PowerStrikeSkill
~~~
### 기능 목록

