package compare;

import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println("==기본 데이터==");
        System.out.println(list);

        System.out.println("Comparable 기본정렬");
        list.sort(null);
        System.out.println(list);

        System.out.println("Id정렬");
        list.sort(new IdComparator());
        System.out.println(list);
    }
}
//Tree구조를 쓸때는 무조건 Comparable, Comparator가 필요하다.
//자료를 넣을때부터 비교를 하고 들어가기 때문.
