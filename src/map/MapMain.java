package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentB", 80);
        studentMap.put("studentA", 70);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 90);
        System.out.println(studentMap);

        //특정 학생값 조회
        System.out.println("studentA = " + studentMap.get("studentA"));

        //Set으로 나옴
        studentMap.keySet().forEach(System.out::println);

        //EntrySet활용 (키 값을 묶은 값을 조회)
        //Set<Map내부클래스 Entry<String, Integer>>
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        //Collection으로 나옴
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = "+value);
        }
    }
}
