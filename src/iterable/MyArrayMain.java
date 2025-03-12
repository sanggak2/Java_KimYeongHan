package iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();

        //아래 두 코드는 사실 같은 코드이다.
        System.out.println("iterator 사용");
        while (iterator.hasNext()) {
            System.out.println("value = " + iterator.next());
        }
//===================================================================
        System.out.println("for-each 사용");
        for (Integer i : myArray) {
            System.out.println("value = " + i);
        }

    }
}

