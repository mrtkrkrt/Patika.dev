import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double price, kdvPrice, totalPrice;
        double kdvRate;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        price = sc.nextDouble();

        kdvRate = ((price < 1000) & (price>0)) ? 0.18 : 0.08;
        System.out.println("KDV'siz Tutar : " + price);
        System.out.println("KDV Oranı : " + kdvRate);
        System.out.println("KDV Tutarı : " + price * kdvRate);
        System.out.println("KDV'li Tutar : " + ((price * kdvRate) + price));

    }
}
