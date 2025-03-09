package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        int loop = 10000;
        int size = 50000;
        addFirst(arrayList, size);
        addFirst(linkedList, size);

        System.out.println("==ArrayList조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size-1);
        System.out.println("==ArrayList검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);

        System.out.println("==LinkedList조회==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size-1);
        System.out.println("==LinkedList검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);
    }
    private static void addFirst(List<Integer> list, int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 / 크기: "+size+", 계산 시간: "+(endTime-startTime)+"ms");
    }

    private static void getIndex(List<Integer> list, int loop, int index) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(
                "get(index) / index : "+index+
                        ", 반복: "+loop+", 계산 시간: "+
                        (endTime-startTime)+"ms");
    }

    private static void search(List<Integer> list, int loop, int findValue) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(
                "indexOf(findValue) / findValue : "+findValue+
                        ", 반복: "+loop+", 계산 시간: "+
                        (endTime-startTime)+"ms");
    }
}


/**
 * 전략패턴 Strategy Pattern
 * 알고리즘을 클라이언트 코드 변경 없이 교체하는 것.
 * 위 코드가 전략패턴의 예시라 볼 수 있음.
 * 나중에 코드를 수정할 일이 있어도 BatchProcessor는 바꿀 필요가 없음.
 * 타입이든 인스턴스든 미루면 좋다.
 */