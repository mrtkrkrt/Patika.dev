import java.util.Scanner;

public class Min {

    static void plus() {
        Scanner input = new Scanner(System.in);

        System.out.print("Kac adet sayi toplayacaginizi giriniz: ");
        int sayiMiktari=input.nextInt();
        int toplam=0;
        for(int i=1;i<=sayiMiktari;i++){
            System.out.print(i + ".sayiyiy giriniz:");
            int a=input.nextInt();
            toplam+=a;

        }
        System.out.println("Toplam = "+toplam);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner input = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı :");
            number = input.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = input.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = input.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = input.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = input.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int n = input.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner input = new Scanner(System.in);

        System.out.print("Hangi sayinin modunu alacasiniz:");
        int a= input.nextInt();

        System.out.print("Kac ile mod almasini istiyorsunuz");
        int b=input.nextInt();

        System.out.println(a+" mod "+ b + "= "+ a%b);
    }

    static void alanCevre(){

        Scanner input = new Scanner(System.in);

        System.out.print("Dikdortgenin 1.kenarini giriniz:");
        int a= input.nextInt();

        System.out.print("Dikdortgenin 2.kenarini giriniz");
        int b=input.nextInt();

        System.out.println("Dikdortgenin cevresi = "+ 2*(a+b));
        System.out.println("Dikdortgenin alani   = "+ (a*b));

    }



    public static void main(String[] args)     {

        Scanner input = new Scanner(System.in);

        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alanCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);



    }
}
