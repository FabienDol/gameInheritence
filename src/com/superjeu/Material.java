package com.superjeu;

public enum Material {

    MUD(10), WOOD(20), BRICK(30);

    private int resistance;

    Material(int resistance) {
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }

}
