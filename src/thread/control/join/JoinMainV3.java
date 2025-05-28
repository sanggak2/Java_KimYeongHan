package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV3 {
    public static void main(String[] args) throws InterruptedException {
        log("Start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");

        thread1.start();
        thread2.start();

       //스레드 종료될때까지 대기
        log("join() - main이 thread1/2 종료까지 대기");
        thread1.join();
        thread2.join();
        log("main스레드 대기 완료");

        log("task1.result = "+task1.result);
        log("task2.result = "+task2.result);

        int sumAll = task1.result + task2.result;
        log("task1 + task2 = "+sumAll);
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
