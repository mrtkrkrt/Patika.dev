import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Sayı : ");
            number = sc.nextInt();

            if (number % 4 == 0) sum += number;

        }while (number % 2 == 0);

        System.out.println("Toplam = " + sum);
    }
}
