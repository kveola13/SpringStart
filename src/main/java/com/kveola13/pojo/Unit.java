package com.kveola13.pojo;

public class Unit {
    int uId;
    String name;
    int attack;
    int health;


    public Unit() {
    }

    public Unit(int uId, String name, int attack, int health) {
        this.uId = uId;
        this.name = name;
        this.attack = attack;
        this.health = health;
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

    @Override
    public String toString() {
        return "Unit{" +
                "uId=" + uId +
                ", name='" + name + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }

    public void init(){
        System.out.println("Unit recruited!");
    }

    private void destroy() {
        System.out.println("Unit sold!");
    }
}
