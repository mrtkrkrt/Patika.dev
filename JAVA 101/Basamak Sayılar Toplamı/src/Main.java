import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı : ");
        number = sc.nextInt();

        while (number > 0){
           sum += number % 10;
           number = number / 10;
        }

        System.out.println("Result = " + sum);
    }
}
