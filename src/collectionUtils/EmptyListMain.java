package collectionUtils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list = new ArrayList<>();

        //빈 불변리스트
        List<Object> list2 = Collections.emptyList();   //자바5
        List<Object> list3 = List.of();                 //자바9

        System.out.println("list2.getClass() = " + list2.getClass());
        System.out.println("list3.getClass() = " + list3.getClass());

        //Arrays.asList() 자바 1.2부터 있던건데
        //불변도 가변도 아니니 List.of()가 나음

        //그나마 좀 나은점
        Integer[] arr = { 1, 2, 3 };
        List<Integer> asList = Arrays.asList(arr);//arr배열을 그대로 쓴다. (얕은복사)
        List<Integer> ofList = List.of(arr);    //반복 돌리면서 새로운 배열을 만든다.
        //즉 요소의 갯수가 엄청 많을때 asList가 조금 더 좋을 수 있다.

        asList.set(0, 100); //배열에 있는 값까지 같이 바뀌는걸 볼 수 있다.
        System.out.println("arr = "+Arrays.toString(arr));
        System.out.println("asList = "+asList);
        System.out.println("ofList = " + ofList);

        //사실 asList()는 잊어도됨 ㅋㅋ


    }
}
