package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        //데이터 추가
        deque.push(1);
        deque.push(2);
        System.out.println(deque);

        //데이터 단순 조회
        System.out.println("deque.peek() = " + deque.peek());

        //데이터 꺼내기
        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque);
    }
}
