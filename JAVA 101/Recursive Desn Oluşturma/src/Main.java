import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı : ");
        N = sc.nextInt();

        executeModel(N, N, false);
    }

    static void executeModel(int a,int b, boolean bool){

        if(a<=b) {
            System.out.println(a);
            if (a>0 && !bool) {
                executeModel(a-5,b,false);
            } else {
                executeModel(a + 5,b, true);
            }}}
}
