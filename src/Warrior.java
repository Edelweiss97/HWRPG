package com.company.character;

import java.util.Random;

public class Warrior extends Hero {

    private int superDamage;

    public Warrior(int health, int damage, int superDamage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
        this.superDamage = superDamage;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int koeff = random.nextInt(50) + 1;
        boss.setHealth(boss.getHealth() - koeff);
        System.out.println("Warrior применил суперспособность:" + koeff);
    }
}
