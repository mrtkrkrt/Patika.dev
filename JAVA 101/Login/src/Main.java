import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı Adı : ");
        username = sc.nextLine();

        System.out.print("Şifre");
        password = sc.nextLine();

        if (username.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Başarılı");
        }else{
            if (username.equals("patika") && !password.equals("java123")){
                int secim;
                System.out.print("Şifre Yanlış! Sıfırlamak İstermisiniz?\n1-Sıfırlamak, 2-Hayır : ");
                secim = sc.nextInt();
                if (secim == 1){
                    String newPassword;
                    System.out.print("Yeni Şifre : ");
                    newPassword = sc.nextLine();

                    if (newPassword.equals("java123")){
                        while (!newPassword.equals("java123")){
                            System.out.println("Eski şifre ile aynı lütfen yeni şifre giriniz :");
                            newPassword = sc.nextLine();
                        }
                    }
                    System.out.println("Şifre Başarıyla Oluturuldu!!!");
                }else{
                    System.out.println("Programdan Çıkıldı!");
                }
            }
        }
    }
}
