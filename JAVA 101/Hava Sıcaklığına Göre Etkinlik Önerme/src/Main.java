import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heat;

        System.out.print("Sıcaklık : ");
        heat = sc.nextInt();

        if (heat < 15){
            if (heat < 5){
                System.out.println("Kayak");
            }else{
                System.out.println("Sinema");
            }
        }else{
            if (heat < 25){
                System.out.println("Piknik");
            }else{
                System.out.println("Yüzme");
            }
        }

    }
}
