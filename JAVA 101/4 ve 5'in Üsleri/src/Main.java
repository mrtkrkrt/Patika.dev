import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.println("Sayı : ");
        number = sc.nextInt();

        for (int i = 1, j = 1; i < number; i*=4, j*=5) {
            System.out.println("i : " + i + " j : " + j);
        }
    }
}
