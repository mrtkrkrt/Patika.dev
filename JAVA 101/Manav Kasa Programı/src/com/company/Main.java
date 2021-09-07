package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.0;
        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlıcan;

        System.out.print("Armut kaç kilo : ");
        kgArmut = sc.nextDouble();

        System.out.print("Elma kaç kilo : ");
        kgElma = sc.nextDouble();

        System.out.print("Domates kaç kilo : ");
        kgDomates = sc.nextDouble();

        System.out.print("Muz kaç kilo : ");
        kgMuz = sc.nextDouble();

        System.out.print("Patlıcan kaç kilo : ");
        kgPatlıcan = sc.nextDouble();

        double total = (armut * kgArmut) + (elma * kgElma) + (domates * kgDomates) + (muz * kgMuz) + (patlıcan * kgPatlıcan);
        System.out.println("Toplam Tutar = " + total);
    }
}
