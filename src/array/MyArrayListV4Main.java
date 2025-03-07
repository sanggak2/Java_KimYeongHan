package array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> StringList = new MyArrayListV4<>();
        StringList.add("a");
        StringList.add("b");
        StringList.add("c");
        System.out.println("StringList.get(0) = " + StringList.get(0));

        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("intList.get(0) = " + intList.get(0));
    }
}
