package com.superjeu;

public abstract class Animal extends Being {

    private Humanoid owner;

    public Animal(String name, int x, int y, int maxHealth, int health, double resistance, Humanoid owner) {
        super(name, x, y, maxHealth, health, resistance);
        this.owner = owner;
    }

    public Humanoid getOwner() {
        return owner;
    }

    public void setOwner(Humanoid owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "owner=" + owner +
                ", health=" + health +
                ", resistance=" + resistance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
