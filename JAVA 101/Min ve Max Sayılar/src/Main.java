import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N, temp, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kaç Sayı Gireceksiniz : ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print((i+1) + ".Sayıyı Giriniz : ");
            temp = sc.nextInt();

            if (temp < min) min = temp;
            if (temp > max) max = temp;
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
