package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cuffia first = new Cuffia("Sony", null, BigDecimal.valueOf(300), BigDecimal.valueOf(0.22), "black", true);

        Cuffia second = new Cuffia("Batton", null, BigDecimal.valueOf(10), BigDecimal.valueOf(0.22), "black", false);

        first.extendedName();
        first.printIsWireless();
        second.extendedName();
        second.printIsWireless();
    }

}
