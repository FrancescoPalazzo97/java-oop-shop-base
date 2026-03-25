package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffia extends Product {
    protected String colore;
    protected boolean isWireless;

    public Cuffia(String name, String bio, BigDecimal price, String colore, boolean isWireless) {
        super(name, bio, price);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String newColore) {
        this.colore = newColore;
    }

    public Boolean getWireless() {
        return this.isWireless;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColore: " + getColore() + "\nWireless: " + getWireless();
    }
}
