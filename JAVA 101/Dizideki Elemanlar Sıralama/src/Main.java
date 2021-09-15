import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] list;
        int tempValue;

        System.out.print("Dizinin Boyutunu Girin: ");
        int listLength = sc.nextInt();

        list = new int[listLength];

        for (int i = 0; i < listLength; i++) {
            System.out.printf("%s. Elemanı Girin: ", i + 1);
            list[i] = sc.nextInt();
        }

        for (int i = 0; i < listLength - 1; i++) {
            for (int j = i + 1; j < listLength; j++) {
                if (list[j] < list[i]) {
                    tempValue = list[i];
                    list[i] = list[j];
                    list[j] = tempValue;
                }
            }
        }

        System.out.println(Arrays.toString(list));
    }
}
