package thread.ex4;

import static util.MyLogger.log;

public class Ex4Main {
    public static void main(String[] args) {
        PrintRunnable runnable1 = new PrintRunnable("A", 1000);
        PrintRunnable runnable2 = new PrintRunnable("B", 500);
        Thread thread1 = new Thread(runnable1, "Thread-A");
        thread1.start();
        Thread thread2 = new Thread(runnable2, "Thread-B");
        thread2.start();

    }
    static class PrintRunnable implements Runnable {
        private final String content;
        private final int time;

        public PrintRunnable(String content, int time) {
            this.content = content;
            this.time = time;
        }

        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                log(content);
                try {
                    Thread.sleep(time);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
