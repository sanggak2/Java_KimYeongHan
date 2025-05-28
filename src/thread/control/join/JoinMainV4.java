package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV4 {
    public static void main(String[] args) throws InterruptedException {
        log("Start");
        SumTask task1 = new SumTask(1, 50);
        Thread thread1 = new Thread(task1, "Thread-1");

        thread1.start();

       //스레드 종료될때까지 대기
        log("join() - main이 thread1 종료까지 1초 대기");
        thread1.join(1000);
        log("main스레드 대기 완료");

        log("task1.result = "+task1.result);
        log("End");
    }
    static class SumTask implements Runnable {
        private int start;
        private int end;
        private int result;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            log("작업시작");
            sleep(2000);
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum+= i;
            }
            result = sum;
            log("작업완료 result: " + result);
        }
    }
}
