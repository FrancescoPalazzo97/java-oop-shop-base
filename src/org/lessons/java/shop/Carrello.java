package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    private Product[] items;
    private int cartLength = 0;

    public Carrello() {
        this.items = new Product[cartLength];
    }

    public void addItem() {
        Scanner in = new Scanner(System.in);

        System.out.println("Cosa vuoi aggiungere? Puoi scegliere tra Smartphone | Cuffia | Televisore");
        String selectedProduct = in.nextLine();

        if (selectedProduct.toLowerCase().equals("smartphone")) {
            System.out.println("Hai selezionato 'Smartphone'");
        } else if (selectedProduct.toLowerCase().equals("cuffia")) {
            System.out.println("Hai selezionato 'Cuffia'");
        } else if (selectedProduct.toLowerCase().equals("televisore")) {
            System.out.println("Hai selezionato 'Televisore'");
        } else {
            System.out.println("Prodotto inserito non esistente!");
        }

        in.close();
    }
}
