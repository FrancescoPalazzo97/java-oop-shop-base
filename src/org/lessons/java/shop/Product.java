package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    private int code;
    private String name;
    private String bio;
    private BigDecimal price;
    private BigDecimal iva;

    private static final Random randomGen = new Random();

    public Product(String name, String bio, BigDecimal price) {
        this.code = Product.randomGen.nextInt(99999);
        this.name = name;
        this.bio = bio;
        this.price = price;
        this.iva = new BigDecimal(0.22);
    }

    public Product(String name, String bio, BigDecimal price, BigDecimal iva) {
        this.code = Product.randomGen.nextInt(99999);
        this.name = name;
        this.bio = bio;
        this.price = price;
        this.iva = iva;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name.trim() != null) {
            this.name = name;
        }
    }

    public String getBio() {
        return this.bio;
    }

    public void setBio(String bio) {
        if (bio.trim() != null) {
            this.bio = bio;
        }
    }

    public void setBasePrice(BigDecimal newPrice) {
        if (newPrice.compareTo(BigDecimal.ZERO) > 0) {
            this.price = newPrice;
        }
    }

    public BigDecimal getBasePrice() {
        return this.price;
    }

    public BigDecimal getIvaPrice() {
        if (price != null && iva != null) {
            return price.add(price.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }
        return null;
    }

    public void applyDiscount() {
        setBasePrice(this.price.multiply(BigDecimal.ONE.subtract(new BigDecimal(0.2))));
    }

    @Override
    public String toString() {
        if (name != null) {
            return code + "-" + name;
        }
        return null;
    }
}
