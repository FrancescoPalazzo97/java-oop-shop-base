package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    protected final int code;
    protected String name;
    protected String bio;
    protected BigDecimal price;
    protected BigDecimal iva;

    Random r = new Random();

    // * Costruttore con bio
    public Product(String name, String bio, BigDecimal price, BigDecimal iva) {
        this.code = r.nextInt(99999);
        this.name = name;
        this.bio = bio;
        this.price = price;
        this.iva = iva;
    }

    // * Costruttore senza bio
    public Product(String name, BigDecimal price, BigDecimal iva) {
        this.code = r.nextInt(99999);
        this.name = name;
        this.bio = "Nessuna bio";
        this.price = price;
        this.iva = iva;
    }

    // * Metodo per recuperare il codice prodotto
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

    public void getBasePrice() {
        System.out.printf("Il prezzo base è: %.2f%n", this.price);
    }

    public void ivaPrice() {
        if (price != null && iva != null) {
            BigDecimal newPrice = price.subtract(price.multiply(iva)).setScale(2, RoundingMode.DOWN);
            System.out.println("Il prezzo ivato è: " + newPrice);
        }
    }

    public void extendedName() {
        System.out.println(this.code + "-" + this.name);
    }
}
