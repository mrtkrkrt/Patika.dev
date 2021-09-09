import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice, km, age;
        double perKm = 0.1, total = 0;

        Scanner sc =  new Scanner(System.in);

        System.out.print("Kaç KM : ");
        km = sc.nextInt();

        System.out.print("Tek Yön => 1\nGidiş Dönüş => 2 : ");
        choice = sc.nextInt();

        System.out.print("Yaş : ");
        age = sc.nextInt();

        if (choice < 0 && age < 0 && !(choice == 1 || choice == 2)){
            System.out.println("Hatalı Giriş!!!");
        }else{
            total = perKm * km;

            if (age < 12) total /= 2;
            else  if (age >= 12 && age < 24) total *= 0.9;
            else if (age > 65) total *= 0.7;

            if (choice == 2) total *= 0.8;
        }

        System.out.println("Bilet Fİyatınız : " + total * choice);
    }
}
