package com.company.character;

import java.util.Random;

public class Thor extends Hero{

    private int theWorld;

    public Thor(int health, int damage,int theWorld) {
        super(health, damage, SuperAbility.TIME_STOP);
        this.theWorld = theWorld;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int timeStop = random.nextInt(3) + 1;
        switch(timeStop){
            case 1:
                boss.setDamage(0);
                System.out.println("Thor оглушил босса");
                break;
            case 2:
                boss.setDamage(50);
                break;
            case 3:
                boss.setDamage(50);
                break;
        }


    }
}
