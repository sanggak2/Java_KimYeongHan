package map.ex;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        //코드 작성
        Set<String> set = new HashSet<>();
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1000)) set.add(entry.getKey());
        }
        System.out.println(set);
    }
}
