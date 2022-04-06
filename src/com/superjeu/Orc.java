package com.superjeu;

public class Orc extends Humanoid {

    public int rage;

    public Orc(String name, int x, int y, int maxHealth, int health, double resistance, int rage) {
        super(name, x, y, maxHealth, health, resistance);
        this.rage = rage;
    }

    @Override
    public void receiveDamage(int amount){
        this.health -= amount;
        System.out.println("L'orc a subit " + amount + " points de dégâts.");
    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
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
        return "Orc{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", rage=" + rage +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
