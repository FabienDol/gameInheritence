package com.superjeu;

public class Human extends Humanoid {

    public int mana;

    public Human(String name, int x, int y, int maxHealth, int health, double resistance, int mana) {
        super(name, x, y, maxHealth, health, resistance);
        this.mana = mana;
    }

    @Override
    public void receiveDamage(int amount){
        this.health -= amount;
        System.out.println("L'humain a subit " + amount + " points de dégâts.");
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
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
        return "Human{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", mana=" + mana +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
