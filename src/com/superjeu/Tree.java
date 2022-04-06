package com.superjeu;

public class Tree extends Being {

    public Tree(String name, int x, int y, int maxHealth, int health, double resistance) {
        super(name, x, y, maxHealth, health, resistance);
    }

    @Override
    public void receiveDamage(int amount){
        this.health -= amount;
        System.out.println("L'arbre a subit " + amount + " points de dégâts.");
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
        return "Tree{" +
                "health=" + health +
                ", resistance=" + resistance +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

}
