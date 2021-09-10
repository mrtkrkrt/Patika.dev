import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("N : ");
        N = sc.nextInt();

        for (int i = 1 ;i < N; i++) {
            if (N % i == 0) sum += i;
        }

        if (sum == N) System.out.println(N + " mükemmel sayıdır.");
        else System.out.println(N + " mükemmel sayı değildir.");
    }
}
