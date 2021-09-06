import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, kimya, tarih, turkce, muzik;

        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = sc.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = sc.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = sc.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = sc.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = sc.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = sc.nextInt();

        double ortalama = (mat + fizik + kimya + tarih + turkce + muzik) / 6;
        System.out.println("Ortalamanız = " + ortalama);

        boolean isAvgEnough = ortalama > 60;
        String result = isAvgEnough ? "Sınıfı Geçti!" : "Sınıfta Kaldı!";
        System.out.println(result);
    }
}
