package collectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list.getClass() = " + list.getClass());

        //멀티스레드 상황에서 동기화 문제가 발생하지 않게끔 하는 리스트. (더 느리긴함)
        List<Integer> synchronizedList =
                Collections.synchronizedList(list);
        System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass());
    }
}
