package set.ex;

import java.util.*;

public class UniquenameTest1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(List.of(30,20,20,10,10));
        for (Integer s : new Integer[]{30,20,20,10,10}) {
            set.add(s);
        }
        //aslist(T... a) = "..."문법은 인자를 배열로 만든다.
        List<Integer> list1 = Arrays.asList(30,20,20,10,10);


        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
