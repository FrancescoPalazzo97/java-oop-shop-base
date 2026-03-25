package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {

        Product[] products = new Product[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {

            System.out.println("Nome del prodotto: ");
            String pName = input.nextLine();

            System.out.println("Marca del prodotto: ");
            String pBrand = input.nextLine();

            System.out.println("Prezzo (senza iva): ");
            int pPrice = Integer.parseInt(input.nextLine());

            System.out.println("A quale categoria fa parte? tv | smartphone | cuffia");
            String pCategory = input.nextLine();

            switch (pCategory.toLowerCase()) {
                case "tv":

                    System.out.println("Dimensioni della TV in pollici: ");
                    int tvSize = Integer.parseInt(input.nextLine());

                    System.out.println("Smart TV? (Inserisci TRUE o FALSE)");
                    boolean isSmart = Boolean.parseBoolean(input.nextLine());

                    Televisore tv = new Televisore(pName, pCategory, new BigDecimal(pPrice), tvSize, isSmart);

                    products[i] = tv;

                    break;

                case "smartphone":

                    System.out.println("GB di memoria");
                    int gb = Integer.parseInt(input.nextLine());

                    System.out.println("Codice IMEI: ");
                    String imei = input.nextLine();

                    Smartphone phone = new Smartphone(pName, pCategory, new BigDecimal(pPrice), imei, gb);

                    products[i] = phone;

                    break;
                case "cuffia":

                    System.out.println("Colore delle cuffie: ");
                    String color = input.nextLine();

                    System.out.println("Sono wireless? (Inserisci TRUE o FALSE)");
                    boolean isWireless = Boolean.parseBoolean(input.nextLine());

                    Cuffia headphone = new Cuffia(pName, pBrand, new BigDecimal(pPrice), color, isWireless);

                    products[i] = headphone;

                    break;

                default:
                    break;
            }

            System.out.println("--------------------------------");
        }

        input.close();

        System.out.println("Ecco il tuo carrello");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
            System.out.println("-----------------");
        }
    }

}
