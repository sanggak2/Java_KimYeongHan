package map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생이 없는 경우만 데이터 추가
        if(!studentMap.containsKey("studentA")){
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        //학생이 없는 경우만 데이터 추가
        studentMap.putIfAbsent("studentA", 50);
        studentMap.putIfAbsent("studentB", 50);
        System.out.println(studentMap);
    }
}
