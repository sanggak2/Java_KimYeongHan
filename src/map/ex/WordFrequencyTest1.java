package map.ex;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        //코드
        String[] words = text.split(" ");
        Map<String, Integer> map1 = new HashMap<>();
        for (String word : words) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }
        System.out.println(map1);
    }
}
