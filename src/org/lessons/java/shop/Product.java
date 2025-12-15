package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    Random r = new Random();
    public int code;
    public String name;
    public String bio;
    public BigDecimal price;
    public BigDecimal iva;

    public Product(String name, String bio, BigDecimal price, BigDecimal iva) {
        this.code = r.nextInt(99999);
        this.name = name;
        this.bio = bio;
        this.price = price;
        this.iva = iva;
    }

    public void getBasePrice() {
        System.out.printf("Il prezzo base è: %.2f%n", this.price);
    }

    public void ivaPrice() {
        if (price != null && iva != null) {
            BigDecimal newPrice = price.add(price.multiply(iva)).setScale(2, RoundingMode.DOWN);
            System.out.println("Il prezzo ivato è: " + newPrice);
        }
    }

    public void extendedName() {
        System.out.println(this.code + "-" + this.name);
    }
}
