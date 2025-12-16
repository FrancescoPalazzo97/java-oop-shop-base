package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Product smartphone = new Product("OnePlus 15", "Nuovo smartphone di casa OnePlus", new BigDecimal(999.99),
                new BigDecimal(0.22));

        System.out.println("Il codice del prodotto è: " + smartphone.getCode());
        smartphone.getBasePrice();
        smartphone.ivaPrice();
        smartphone.extendedName();
    }
}
