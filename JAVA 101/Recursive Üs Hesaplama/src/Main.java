import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M;

        System.out.print("Taban : ");
        N = sc.nextInt();

        System.out.print("Üs : ");
        M = sc.nextInt();

        System.out.println("Sonuç : " + exponentiate(N, M));
    }

    static int exponentiate(int base, int power){
        if (power == 1) return base;
        return base * exponentiate(base, power-1);
    }
}
