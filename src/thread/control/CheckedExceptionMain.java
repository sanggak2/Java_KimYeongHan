package thread.control;

import static util.ThreadUtils.sleep;

public class CheckedExceptionMain {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }
    static class CheckedRunnable implements Runnable {
        // Runnable인터페이스는 Exception을 재정의하지 않는다.
        // 따라서 여기서도 못던진다
        // 부모가 재정의하지 않는 오류는 자식에서 못던진다. 
        // Parent p = new Child(); 로 만들었을때 자바는 Parent타입에서 재정의된 오류만 보는데
        // 만약 Parent가 InterruptException을 정의했는데 자식에서 Exception을 던져버리면 안되기 때문에
        @Override
        public void run() /*throws Exception*/{
//            throw new Exception();    주석 풀면 예외 발생
            sleep(5000);
        }
    }
}
