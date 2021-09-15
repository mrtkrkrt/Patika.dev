import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : array){
            if (map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }

        for (int i : map.keySet()) {
            System.out.println(i + " sayısı "+ map.get(i) + " kez tekrar edildi.");
        }
    }
}
