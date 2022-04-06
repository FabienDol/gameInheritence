package com.superjeu;

public class House {

    private int price;
    private Humanoid owner;
    private Material mat;

    public House(int price, Humanoid owner, Material mat) {
        this.price = price;
        this.owner = owner;
        this.mat = mat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Humanoid getOwner() {
        return owner;
    }

    public void setOwner(Humanoid owner) {
        this.owner = owner;
    }

    public Material getMaterial() {
        return mat;
    }

    public void setMaterial(Material mat) {
        this.mat = mat;
    }

    @Override
    public String toString() {
        return "House{" +
                "price=" + price +
                ", owner=" + owner +
                ", material=" + mat +
                '}';
    }
}
