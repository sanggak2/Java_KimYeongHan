package map.ex;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4, "C", 5, "D", 6);

        // 코드 작성
        Map<String, Integer> map3 = new HashMap<>();
        for (String s : map2.keySet()) {
            if (map1.containsKey(s)) {
                map3.put(s, map1.get(s)+map2.get(s));
            }
        }

        System.out.println(map3);
    }
}
