import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, x2, x3;
        System.out.print("Sırayla  üç  kenaarı girin : ");
        x1 = sc.nextDouble();
        x2 = sc.nextDouble();
        x3 = sc.nextDouble();

        double u = (x1 + x2 + x3) / 2;
        double cevre = 2 * u;
        double alan = Math.sqrt(u * (u - x1) * (u - x2) * (u - x3));

        System.out.println("Alan : " + alan);
        System.out.println("Çevre : " + cevre);
    }
}
