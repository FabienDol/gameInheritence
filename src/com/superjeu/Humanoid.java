package com.superjeu;

public abstract class Humanoid extends Being {

    public Humanoid(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }

    @Override
    public String toString() {
        return "Humanoid{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
