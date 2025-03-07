package array;

import java.util.Arrays;

//V4 제네릭 사용
public class MyArrayListV4<E> {
    private static final int DEFAULT_CAPACITY =5;   //기본 배열 할당값

    private Object[] elementData;   //배열
    private int size = 0;   //현재 들어있는 요소의 갯수

    //기본 할당
    public MyArrayListV4() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    //지정 할당
    public MyArrayListV4(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    //요소 갯수 리턴
    public int size(){
        return size;
    }

    //값 추가
    public void add(E e){
        //V2: 배열 확장
        if(size == elementData.length)grow();
        elementData[size] = e;
        size++;
    }

    //V3: 원하는 위치에 값 추가
    public void add(E e,  int index){
        if(size == elementData.length)grow();
        //V3: 데이터 이동
        shiftRightFrom(index);
        elementData[index] = e;
        size++;
    }

    //V3: 데이터 오른쪽을 이동
    private void shiftRightFrom(int index) {
        for(int i=size; i>index; i--){
            elementData[i] = elementData[i-1];
        }
    }

    //V2: 배열 확장
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity*2;
        //배열을 새로 만들고, 새 배열에 기존 값 복사, 참조 바꾸기
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    //배열[인덱스] 리턴
    @SuppressWarnings("unchecked")
    public E get(int index){
        return (E)elementData[index];
    }

    //배열[인덱스]기존 값 리턴 후 새 값으로 변경
    public E set(int index, E e){
        E oldValue = get(index);
        elementData[index] = e;
        return oldValue;
    }

    //값 제거
    public E remove(int index){
        E oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    //요소 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size-1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    //인자값의 인덱스 검색
    public int indexOf(E e){
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
