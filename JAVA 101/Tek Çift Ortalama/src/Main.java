import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.println("Kaça Kadar : ");
        number = sc.nextInt();

        int sum = 0, count = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                count += 1;
            }
        }
    }
}
