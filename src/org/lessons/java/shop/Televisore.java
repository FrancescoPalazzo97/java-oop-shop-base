package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Product {
    protected int dimensione;
    protected boolean isSmart;

    public Televisore(String name, String bio, BigDecimal price, BigDecimal iva, int dimensione, boolean isSmart) {
        super(name, bio, price, iva);
        this.dimensione = dimensione;
        this.isSmart = isSmart;
    }

    public void printDimensione() {
        System.out.println("La dimensione è: " + this.dimensione);
    }

    public void printIsSmart() {
        if (!isSmart) {
            System.out.println("Il televisore non è smart!");
            return;
        }
        System.out.println("Il televisore è smart!");
    }
}
