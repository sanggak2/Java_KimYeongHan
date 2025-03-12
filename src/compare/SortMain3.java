package compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        MyUser[] arr = {user1, user2, user3};
        System.out.println("==기본 데이터==");
        System.out.println(Arrays.toString(arr));

        System.out.println("Comparable기본정렬");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Id로 정렬");
        Arrays.sort(arr, new IdComparator());
        System.out.println(Arrays.toString(arr));

        System.out.println("Id오름차순");
        Arrays.sort(arr, new IdComparator().reversed());
        System.out.println(Arrays.toString(arr));

        //객체를 비교할때 Comparable이든 Comparator든 구현해야한다.
        //Id로 정렬할때처럼 Comparator(비교자)를 만들어서 넣어주면 문제없긴하다.
    }
}
