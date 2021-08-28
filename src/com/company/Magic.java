package com.company.character;

import java.util.Random;

public class Magic extends Hero {

    private int FireBall;

    public Magic(int health, int damage, int fireBall) {
        super(health, damage, SuperAbility.BOOST);
        FireBall = fireBall;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random1 = new Random();
        int koeffi = random1.nextInt(10) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbility().equals(SuperAbility.BOOST)){
                boss.setHealth(boss.getHealth() - FireBall * koeffi);
            }
        }
        System.out.println("Magic повысил урон: " + FireBall * koeffi);
    }
}