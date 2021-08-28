package com.company.character;

import java.util.Random;

public class Tank extends Hero {

    private int super_damage;

    public Tank(int health, int damage, int super_damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
        this.super_damage = super_damage;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int koeff = random.nextInt(20) + 1;
        boss.setHealth(boss.getHealth() - super_damage * koeff);
        System.out.println("Tank возвратил: " + super_damage * koeff);
    }
}