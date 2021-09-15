import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı : ");
        num = sc.nextInt();

        int closeMin = Integer.MAX_VALUE, closeMax = Integer.MAX_VALUE, closeMinNum = 0, closeMaxNum = 0;

        for (int i : list){
            if (i < num){
                int difference = num - i;
                if (difference < closeMin){
                    closeMin = difference;
                    closeMinNum = i;
                }
            }else if (i > num){
                int difference = i - num;
                if (difference < closeMax){
                    closeMax = difference;
                    closeMaxNum = i;
                }
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closeMinNum + "\nGirilen sayıdan büyük en yakın sayı : " + closeMaxNum);
    }
}
