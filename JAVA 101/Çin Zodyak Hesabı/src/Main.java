import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] horoscopes = {
                "Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan",
                "Tavşan","Ejderha","Yılan","At","Koyun"};

        Scanner input = new Scanner(System.in);

        int birthYear,result;

        System.out.println("Doğum Yılı :");
        birthYear = input.nextInt();

        result = birthYear % 12;

        System.out.println("Çin Zodyak Burcunuz : "+horoscopes[result]);
    }
}
