import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat, fizik, kimya, turkce, muzik;

        System.out.print("Matematik : ");
        mat = sc.nextInt();
        mat = (mat < 0 && mat > 100) ? 0 : mat;

        System.out.print("Fizik : ");
        fizik = sc.nextInt();
        fizik = (fizik < 0 && fizik > 100) ? 0 : fizik;

        System.out.print("Kimya : ");
        kimya = sc.nextInt();
        kimya = (kimya < 0 && kimya > 100) ? 0 : kimya;

        System.out.print("Türkçe : ");
        turkce = sc.nextInt();
        turkce = (turkce < 0 && turkce > 100) ? 0 : turkce;

        System.out.print("Müzik : ");
        muzik = sc.nextInt();
        muzik = (muzik < 0 && muzik > 100) ? 0 : muzik;

        double average = (mat + fizik + kimya + turkce + muzik) / 5;

        if (average < 55){
            System.out.println("Sınıfta Kaldınız");
            System.out.println("Ortalama : " + average);
        }else{
            System.out.println("Sınıfı Geçtiniz.");
            System.out.println("Ortalama : " + average);
        }
    }
}
