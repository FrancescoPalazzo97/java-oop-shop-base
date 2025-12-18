package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    protected String IMEI;
    protected int memoria;

    public Smartphone(String name, String bio, BigDecimal price, BigDecimal iva, String IMEI, int memoria) {
        super(name, price, iva);
        this.IMEI = IMEI;
        this.memoria = memoria;
    }

    public void printImei() {
        System.out.println("L'IMEI di " + this.name + ": " + this.IMEI);
    }

    public void setMemoria(int memoriaOccupata) {
        if (memoriaOccupata > 0) {
            this.memoria -= memoriaOccupata;
        } else {
            System.out.println("Il valore non può essere negativo!");
        }
    }

    public void printMemoria() {
        System.out.println("Memoria disponibile: " + this.memoria);
    }
}
