package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    private Product[] items;
    private int cartLength = 0;

    public Carrello() {
        this.items = new Product[cartLength];
    }

    public String getCart() {
        String cartString = "Carrello:\n";
        for (int i = 0; i < items.length; i++) {
            cartString += items[i].toString();
        }
        return cartString;
    }

    public void addItem() {

        System.out.println("Cosa vuoi aggiungere? Puoi scegliere tra Smartphone | Cuffia | Televisore");

        Scanner in = new Scanner(System.in);
        String selectedProduct = in.nextLine();

        if (selectedProduct.toLowerCase().equals("smartphone")) {
            System.out.println("Hai selezionato 'Smartphone'");
            System.out.println("Inserisci nome dello smartphone: ");
            String smartphoneName = in.nextLine();
            Smartphone newSmartphone = new Smartphone(smartphoneName, "Bio smartphone", new BigDecimal(999),
                    "sadfasfae", 1024);
            cartLength++;
            Product[] newCart = new Product[cartLength];
            int i = 0;
            while (i < 0) {
                items[i] = newCart[i];
                i++;
            }
            newCart[i] = newSmartphone;
            this.items = newCart;
            System.out.println(getCart());
        } else if (selectedProduct.toLowerCase().equals("cuffia")) {
            System.out.println("Hai selezionato 'Cuffia'");
            System.out.println("Inserisci nome della cuffia: ");
            String cuffiaName = in.nextLine();
            BigDecimal price = new BigDecimal(200);
            BigDecimal iva = new BigDecimal(0.22);
            Cuffia newCuffia = new Cuffia(cuffiaName, "bio cuffia", price, iva, "nero", true);
            cartLength++;
            Product[] newCart = new Product[cartLength];
            int i = 0;
            while (i < 0) {
                items[i] = newCart[i];
                i++;
            }
            newCart[i] = newCuffia;
            this.items = newCart;
            System.out.println(getCart());
        } else if (selectedProduct.toLowerCase().equals("televisore")) {
            System.out.println("Hai selezionato 'Televisore'");
            System.out.println("Inserisci nome del televisore: ");
            String tvName = in.nextLine();
            BigDecimal price = new BigDecimal(200);
            BigDecimal iva = new BigDecimal(0.22);
            Televisore newTv = new Televisore(tvName, "bio Tv", price, iva, 100, true);
            cartLength++;
            Product[] newCart = new Product[cartLength];
            int i = 0;
            while (i < 0) {
                items[i] = newCart[i];
                i++;
            }
            newCart[i] = newTv;
            this.items = newCart;
            System.out.println(getCart());
        } else {
            System.out.println("Prodotto inserito non esistente!");
        }

        in.close();
    }
}
