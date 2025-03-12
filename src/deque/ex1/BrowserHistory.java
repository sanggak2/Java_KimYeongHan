package deque.ex1;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> stack = new ArrayDeque<>();
    public void visitPage(String s) {
        stack.push(s);
        System.out.println("방문 = " + s);
    }

    public String goBack() {
        if(!stack.isEmpty()){
            stack.pop();
            System.out.println("뒤로가기 = " + stack.peek());
            return stack.peek();
        }
        return null;
    }
}
