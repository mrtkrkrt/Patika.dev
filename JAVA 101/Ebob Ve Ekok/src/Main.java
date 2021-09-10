import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2,ebob=1, ekok;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci Sayı : ");
        n1 = sc.nextInt();

        System.out.print("İkinci Sayı : ");
        n2 = sc.nextInt();

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }

        ekok = (n1 * n2) / ebob;
        System.out.printf(" %d ve  %d sayılarının EBOB'u %d \n", n1, n2, ebob);
        System.out.printf(" %d ve  %d sayılarının EKOK'u %d \n", n1, n2, ekok);
    }
}
