import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1, x2, x3, max = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sıralanacak 3 sayı girin : ");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        x3 = sc.nextInt();

        int[] dizi = {x1, x2, x3};

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > max) max = dizi[i];
        }

        System.out.println("Max = " + max);
    }
}
