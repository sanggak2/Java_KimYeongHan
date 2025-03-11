package array;

import java.util.Arrays;

public class MyArrayListV1 {
    private static final int DEFAULT_CAPACITY =5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        elementData[size] = e;
        size++;
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object e){
        Object oldValue = get(index);
        elementData[index] = e;
        return oldValue;
    }

    public int indexOf(Object e){
        for (int i = 0;  i < size;  i++) {
            if(e.equals(elementData[i])) return i;
        }
        return -1;
    }

    //값이 들어있는 사이즈 만큼만 출력
    public String toString(){
        return Arrays.toString(Arrays.copyOf(elementData, size)) +
                " size="+size+", capacity="+elementData.length;
    }
}
