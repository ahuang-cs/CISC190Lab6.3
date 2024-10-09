package edu.sdccd.cisc190.character;

import edu.sdccd.cisc190.weapon.Staff;
import edu.sdccd.cisc190.weapon.Weapon;

public class Wizard extends Character {
    private int magicPoints;
    private int enchantWeaponPoints;
    private int enchantWeaponBonus;

    public Wizard(String name, int healthPoints, int strengthPoints, int defensePoints, Staff staff, int magicPoints, int enchantWeaponPoints, int enchantWeaponBonus) {
        super(name, healthPoints, strengthPoints, defensePoints, staff);
        this.magicPoints = magicPoints;
        this.enchantWeaponPoints = enchantWeaponPoints;
        this.enchantWeaponBonus = enchantWeaponBonus;
    }

    @Override
    public void attack(Character opponent) {
        // deal damage with the enchanted staff if enough magicPoints exist

        // if opponent survives, takes damage
    }

    public void equip(Staff staff) {
        this.setWeapon(staff);
    }
}
