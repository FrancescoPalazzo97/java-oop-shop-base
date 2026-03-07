package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    protected String IMEI;
    protected int memoria;

    public Smartphone(String name, String bio, BigDecimal price, BigDecimal iva, String IMEI, int memoria) {
        super(name, bio, price);
        this.IMEI = IMEI;
        this.memoria = memoria;
    }

    public void setImei(String newImei) {
        this.IMEI = newImei;
    }

    public String getImei() {
        return "IMEI: " + this.IMEI;
    }

    public void setMemoria(int newMemoria) {
        this.memoria = newMemoria;
    }

    public String getMemoria() {
        return "Memoria disponibile: " + this.memoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getImei() + "\n" + getMemoria();
    }
}
