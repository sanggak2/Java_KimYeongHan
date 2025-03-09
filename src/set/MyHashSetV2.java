package set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] bucket;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        bucket = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    public boolean add(Object value){
        if (bucket[hashIndex(value)].contains(value)) return false;
        bucket[hashIndex(value)].add(value);
        size++;
        return true;
    }


    public boolean contains(Object value) {
        return bucket[hashIndex(value)].contains(value);
    }

    public boolean remove(Object value) {
        boolean result = bucket[hashIndex(value)].remove(value);
        if (result) {
            size--;
            return true;
        }
        else {return false;}
    }

    public int size(){
        return size;
    }

    private int hashIndex(Object value){
        return Math.abs(value.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "bucket=" + Arrays.toString(bucket) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
