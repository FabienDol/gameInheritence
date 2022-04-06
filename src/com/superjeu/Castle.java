package com.superjeu;

public class Castle extends House {

    public int defense;

    public Castle(int price, Humanoid owner, Material mat, int defense) {
        super(price, owner, mat);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Castle{" +
                "defense=" + defense +
                '}';
    }
}
