package array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        //마지막에 값 추가
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //원하는 위치에 값 추가
        System.out.println("==addLast==");
        list.add ("addLast", 3);
        System.out.println(list);

        System.out.println("==addFirst==");
        list.add ("addFirst", 0);
        System.out.println(list);

        //삭제
        System.out.println("list.remove(4) = " + list.remove(4));
        System.out.println(list);

        System.out.println("list.remove(0) = " + list.remove(0));
        System.out.println(list);
    }
}
