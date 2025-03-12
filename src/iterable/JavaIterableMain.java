package iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printAll(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(set.iterator());
        foreach(set);

    }

    private static void foreach(Iterable<Integer> iter) {
        System.out.println("iterable = "+iter.getClass());
        for (Integer i : iter) {
            System.out.println(i);
        }
    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}

/**
 * Iterable : 순회 가능한 구현체에 상속
 * Iterator : 순회시키는 주체클래스에 상속
 *
 * 순회할 수 있는 구현체(Iterable)가
 * iterator()를 통해서 순회자(Iterator)클래스에 인자값 전달하고
 * Iterator를 받은 클래스가 직접 순회.
 *
 *  #for-each쓰려면 배열이거나, Iterable을 상속받은 구현체여야 한다.
 */

/**
 * Iterator(반복자) 디자인패턴
 * 컬렉션 요소를 순회할때 사용하는 디자인패턴.
 * List든 Set이든 내부 구현방식(서로 다른 순회법)을 노출 안시키고 순회할 수 있게 하는 것.
 * 이로써 재사용성을 높임. (이거 안쓰면 내부 구현방식 맞춰서 다 만들어야 됨.)
 */
