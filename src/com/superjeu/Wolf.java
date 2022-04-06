package com.superjeu;

public class Wolf extends Animal {

    public Wolf(String name, int x, int y, int maxHealth, int health, double resistance, Humanoid owner) {
        super(name, x, y, maxHealth, health, resistance, owner);
    }

    @Override
    public void receiveDamage(int amount){
        this.health -= amount;
        System.out.println("Le loup a subit " + amount + " points de dégâts.");
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
        return "Wolf{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
