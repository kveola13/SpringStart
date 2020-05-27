package com.kveola13.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Unit {
    int uId;
    String name;
    int attack;
    int health;
    Race race;

    public Unit() {
    }

    public Unit(int uId, String name, int attack, int health, Race race) {
        this.uId = uId;
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.race = race;
    }

    @Autowired
    public Unit(Race race) {
        this.race = race;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "uId=" + uId +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                ", race=" + race +
                '}';
    }

    public void init() {
        System.out.println("Unit recruited!");
        race.init();
    }

    private void destroy() {
        System.out.println("Unit sold!");
    }
}
