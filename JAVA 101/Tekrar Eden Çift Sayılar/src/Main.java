import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 8, 12, 12, 5, 3, 7, 8, 8, 9, 9, 16, 16, 16, 16, 14};

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array){
            if (!map.containsKey(i)) map.put(i, 1);
            else map.put(i, map.get(i) + 1);
        }

        System.out.println(map);

        for (int i : map.keySet()) {
            if (i % 2 == 0 && map.get(i) > 1) System.out.println(i);
        }
    }
}
