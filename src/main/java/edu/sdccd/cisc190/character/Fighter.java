package edu.sdccd.cisc190.character;

import edu.sdccd.cisc190.weapon.Blade;

public class Fighter extends Character {

    public Fighter(String name, int healthPoints, int strengthPoints, int defensePoints, Blade blade) {
        super(name, healthPoints, strengthPoints, defensePoints, blade);
    }

    @Override
    public void attack(Character opponent) {
        // deal damaage

        // if opponent still alive, take damage
    }
}
