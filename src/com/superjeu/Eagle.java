package com.superjeu;

public class Eagle extends Animal {

    public int vision;

    public Eagle(String name, int x, int y, int maxHealth, int health, double resistance, Humanoid owner, int vision) {
        super(name, x, y, maxHealth, health, resistance, owner);
        this.vision = vision;
    }

    @Override
    public void receiveDamage(int amount){
        this.health -= amount;
        System.out.println("L'aigle a subit " + amount + " points de dégâts.");
    }

    public int getVision() {
        return vision;
    }

    public void setVision(int vision) {
        this.vision = vision;
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
        return "Eagle{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", vision=" + vision +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
