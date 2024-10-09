package edu.sdccd.cisc190.character;

import edu.sdccd.cisc190.weapon.Weapon;

abstract public class Character {
    public final String name;
    private Weapon weapon;
    private int healthPoints;
    private int strengthPoints;
    private int defensePoints;

    public Character(String name, int healthPoints, int strengthPoints, int defensePoints, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoints = healthPoints;
        this.strengthPoints = strengthPoints;
        this.defensePoints = defensePoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    abstract public void attack(Character opponent);

    public boolean isAlive() {
        return healthPoints > 0;
    }
}
