package set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] bucket;
    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        bucket = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            bucket[i] = new LinkedList<>();
        }
    }

    public boolean add(E value){
        if (bucket[hashIndex(value)].contains(value)) return false;
        bucket[hashIndex(value)].add(value);
        size++;
        return true;
    }


    public boolean contains(E value) {
        return bucket[hashIndex(value)].contains(value);
    }

    public boolean remove(E value) {
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

    private int hashIndex(E value){
        return Math.abs(value.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "bucket=" + Arrays.toString(bucket) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
