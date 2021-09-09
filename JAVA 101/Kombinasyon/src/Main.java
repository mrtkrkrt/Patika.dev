import java.util.Scanner;

public class Main {

    public static int fact(int n){
        int fac = 1;
        for (int i = 0; i < n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        int n, r;
        Scanner sc = new Scanner(System.in);

        System.out.print("N : ");
        n = sc.nextInt();

        System.out.print("M : ");
        r = sc.nextInt();

        double result = fact(n) / (fact(r) * (fact(n-r)));
        System.out.println("Result : " + result);

    }
}
