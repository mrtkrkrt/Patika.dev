import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.2, totalPrice, startPrice = 10;

        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç Kilometre ? : ");
        km = sc.nextInt();

        totalPrice = (km * perKm) + startPrice;
        totalPrice = (totalPrice < 20) ? 20 : totalPrice;
        System.out.println("Toplam Ucret : " + totalPrice);
    }
}
