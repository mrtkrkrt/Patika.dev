import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, sayi3, sayi4, ebob1 = 1, ebob2 = 1, ekok1 = 1, ekok2 = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("!!! EBOB VE EKOK BULAN PROGRAM (FOR DÖNGÜSÜ) !!!\n");

        System.out.print("1. Sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        sayi2 = input.nextInt();

        for (int x = 1; x <= sayi1; x++) {
            if (sayi1 % x == 0 && sayi2 % x == 0) {
                ebob1 = x;
            }
        }
        System.out.println("EBOB: " + ebob1);

        for (int y = 1; y <= sayi1 * sayi2; y++) {
            if (y % sayi1 == 0 && y % sayi2 == 0) {
                ekok1 = y;
                break;
            }
        }
        System.out.println("EKOK: " + ekok1);

        System.out.println("\n!!! EBOB VE EKOK BULAN PROGRAM (WHILE DÖNGÜSÜ) !!!\n");

        System.out.print("1. Sayıyı giriniz: ");
        sayi3 = input.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        sayi4 = input.nextInt();
        int y = 1;
        while (y <= sayi3) {
            if (sayi3 % y == 0 && sayi4 % y == 0) {
                ebob2 = y;
            }
            y++;
        }
        System.out.println("EBOB: " + ebob2);

        int a = 1;
        while (a <= sayi3 * sayi4) {
            if (a % sayi3 == 0 && a % sayi4 == 0) {
                ekok2 = a;
                break;
            }
            a++;
        }
        System.out.println("EKOK: " + ekok2);
    }
}
