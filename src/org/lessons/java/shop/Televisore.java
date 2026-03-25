package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Product {
    protected int dimensione;
    protected boolean isSmart;

    public Televisore(String name, String bio, BigDecimal price, int dimensione, boolean isSmart) {
        super(name, bio, price);
        this.dimensione = dimensione;
        this.isSmart = isSmart;
    }

    public void setDimensione(int newDimensione) {
        this.dimensione = newDimensione;
    }

    public int getDimensione() {
        return this.dimensione;
    }

    public void setIsSmart(boolean isSmartTv) {
        this.isSmart = isSmartTv;
    }

    public boolean isSmart() {
        return this.isSmart;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDimensioni TV: " + getDimensione() + "\nSmart: " + isSmart();
    }
}
