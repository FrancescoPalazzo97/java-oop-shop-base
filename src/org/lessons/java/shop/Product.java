package org.lessons.java.shop;

import java.util.Random;

public class Product {
    Random r = new Random();
    public int code;
    public String name;
    public String bio;
    public float price;
    public int iva;

    public Product(String name, String bio, float price, int iva) {
        this.code = r.nextInt(99999);
        this.name = name;
        this.bio = bio;
        this.price = price;
        this.iva = iva;
    }

    public void basePrice() {
        System.out.printf("Il prezzo base è: %.2f%n", this.price);
    }

    public void ivaPrice() {
        float newPrice = this.price * (1 + this.iva / 100f);
        System.out.printf("Il prezzo comprensivo di iva è: %.2f%n", newPrice);
    }

    public void extendedName() {
        System.out.println(this.code + "-" + this.name);
    }
}
