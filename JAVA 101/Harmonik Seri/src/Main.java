import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        double result = 0.0;

        System.out.print("Sayı : ");
        number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            result += (1 / i);
        }

        System.out.println("Result : " + result);
    }
}
