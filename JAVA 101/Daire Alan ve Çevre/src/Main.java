import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r, pi = 3.14, angle;

        System.out.print("Yarıçap : ");
        r = sc.nextDouble();
        System.out.print("Açı :");
        angle = sc.nextDouble();

        double alan = (pi * r * r * angle) / 360;
        System.out.println("Alan = " + alan);
    }
}
