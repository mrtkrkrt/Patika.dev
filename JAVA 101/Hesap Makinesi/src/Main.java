import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1, x2, operation;

        System.out.print("Birinci Sayı : ");
        x1 = sc.nextInt();

        System.out.print("İkinci Sayı : ");
        x2 = sc.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-bölme : ");
        operation = sc.nextInt();

        switch (operation){
            case 1:
                System.out.println("Toplam = " + (x1 +x2));
                break;
            case 2:
                System.out.println("Çıkarım = " + (x1 - x2));
                break;

            case 3:
                System.out.println("Çarpım =  " + (x1 * x2));

            case 4:
                System.out.println("Bölüm = " + (x1 / x2));
        }
    }
}
