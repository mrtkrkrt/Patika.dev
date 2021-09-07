import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double boy, kilo;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = sc.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = sc.nextDouble();

        double index = kilo / (Math.pow(boy, 2));
        System.out.println("Vücut Kitle Endeksiniz : " + index);
    }
}
