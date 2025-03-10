package map.ex;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};
        Map<String, Integer> map = new HashMap<>();
        for (String[] s : productArr) {
            map.put(s[0], Integer.valueOf(s[1]));
        }

        for (String s : map.keySet()) {
            System.out.println("Key: " + s + " Value: " + map.get(s));
        }
    }
}
