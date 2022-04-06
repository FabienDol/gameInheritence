package com.superjeu;

public class Dragon extends Animal {

    private int power;
    private int range;

    public Dragon(String name, int x, int y, int maxHealth, int health, double resistance, Humanoid owner, int power, int range) {
        super(name, x, y, maxHealth, health, resistance, owner);
        this.power = power;
        this.range = range;
    }

    @Override
    public void receiveDamage(int amount){
        this.health -= amount;
        System.out.println("Le dragon a subit " + amount + " points de dégâts.");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public int compareTo(Being b) {
        if (this.health < b.health) {
            return -1;
        } else if (this.health > b.health) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", power=" + power +
                ", range=" + range +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
