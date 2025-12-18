package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffia extends Product {
    protected String colore;
    protected boolean isWireless;

    public Cuffia(String name, String bio, BigDecimal price, BigDecimal iva, String colore, boolean isWireless) {
        super(name, bio, price, iva);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public void printColore() {
        System.out.println("il colore è " + this.colore);
    }

    public void printIsWireless() {
        if (!isWireless) {
            System.out.println("Non è wireless!");
            return;
        }
        System.out.println("È wireless!");
    }
}
