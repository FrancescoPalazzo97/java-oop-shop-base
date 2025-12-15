package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Product smartphone = new Product("OnePlus 15", "Nuovo smartphone di casa OnePlus", 999.99f, 22);

        smartphone.basePrice();
        smartphone.ivaPrice();
        smartphone.extendedName();
    }
}
