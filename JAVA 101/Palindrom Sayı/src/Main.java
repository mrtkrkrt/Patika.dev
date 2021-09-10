import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("N : ");
        N = sc.nextInt();

        System.out.println(isPalindrom(N));
    }

    static boolean isPalindrom(int N){
        int temp = N, total = 0;

        while (N > 0){
            total *= 10;
            total += N % 10;
            N /= 10;
        }

        if (total == temp) return true;
        return false;
    }
}
