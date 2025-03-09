package set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Integer>[] bucket;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        bucket = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    public boolean add(int value){
        int hashIndex = hashIndex(value);
        if (bucket[hashIndex].contains(value)) return false;
        bucket[hashIndex].add(value);
        size++;
        return true;
    }


    public boolean contains(int value) {
        int hashIndex = hashIndex(value);
        return bucket[hashIndex].contains(value);
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(hashIndex(value));
        boolean result = bucket[hashIndex].remove(Integer.valueOf(value));
        if (result) {
            size--;
            return true;
        }
        else {return false;}
    }

    public int size(){
        return size;
    }

    private int hashIndex(int value){
        return value%capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "bucket=" + Arrays.toString(bucket) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
