package set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        //값 추가
        LinkedList<Integer>[] bucket = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            bucket[i] = new LinkedList<>();
        }
        add(bucket, 1);
        add(bucket, 2);
        add(bucket, 5);
        add(bucket, 8);
        add(bucket, 14);
        add(bucket, 99);
        add(bucket, 9);
        add(bucket, 9);


        //검색
        int searchValue = 9;
        System.out.println("bucket = " + Arrays.toString(bucket));
        System.out.println("contains(bucket, searchValue) = " + contains(bucket, searchValue));
    }

    private static void add(LinkedList<Integer>[] bucket, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> temp = bucket[hashIndex];

        if(!temp.contains(value)) temp.add(value);
    }

    private static boolean contains(LinkedList<Integer>[] bucket, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        return bucket[hashIndex].contains(searchValue);
    }

    static int hashIndex(int value){
        return value%CAPACITY;
    }
}
