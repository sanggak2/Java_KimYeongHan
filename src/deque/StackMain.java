package deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);

        //다음 꺼낼거 확인
        System.out.println("peek() = "+stack.peek());

        //스택 요소 꺼내기
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
