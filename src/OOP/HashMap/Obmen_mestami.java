package OOP.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Obmen_mestami {
    public static void main(String[] args) {
        HashMap<String, Integer> first = new HashMap<>();
        first.put("X", 1);
        first.put("Y", 2);
        first.put("Z", 3);

        HashMap<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> change : first.entrySet()) {
            newMap.put(change.getValue(), change.getKey());
        }
        System.out.println("Исходный Map: " + first);
        System.out.println("Измененый Map: " + newMap);
    }
}
