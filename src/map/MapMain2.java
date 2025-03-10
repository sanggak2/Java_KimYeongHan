package map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        //같은 키에 넣으면 기존 값 교체
        studentMap.put("studentA", 80);
        System.out.println(studentMap);
        System.out.println("containsKey(studentA) = " + studentMap.containsKey("studentA"));

        //특정 학생 값 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
