package list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        BatchProcessor b1 = new BatchProcessor(arrayList);
        BatchProcessor b2 = new BatchProcessor(linkedList);
        int loop = 10000;
        int size = 50000;

        b1.addLast(size);
        System.out.println("==MyArrayList조회==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size/2);
        getIndex(arrayList, loop, size-1);
        System.out.println("==MyArrayList검색==");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);

        b2.addFirst(size);
        System.out.println("==MyLinkedList조회==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size/2);
        getIndex(linkedList, loop, size-1);
        System.out.println("==MyLinkedList검색==");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);
    }
    private static void getIndex(MyList<Integer> list, int loop, int index) {
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

    private static void search(MyList<Integer> list, int loop, int findValue) {
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