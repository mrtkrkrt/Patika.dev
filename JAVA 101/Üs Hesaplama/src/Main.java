import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, power, result = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı : ");
        number = sc.nextInt();

        System.out.print("Üs : ");
        power = sc.nextInt();

        for (int i = 0; i < power; i++) {
            result *= number;
        }
        System.out.println("Sonuç = " + result);
    }
}
