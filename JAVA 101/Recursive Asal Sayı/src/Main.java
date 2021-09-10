import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);

        System.out.print("N : ");
        N = sc.nextInt();

        System.out.println("N asal sayı mı? = " + isPrime(N, 2));
    }

    static boolean isPrime(int n, int i){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;

        return isPrime(n, i + 1);

    }
}
