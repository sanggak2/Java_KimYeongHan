package thread.ex2;

import static util.MyLogger.log;

public class Ex2Main {
    public static void main(String[] args) {
        CounterRunnable counterThread = new CounterRunnable();
        Thread thread = new Thread(counterThread, "counter");
        thread.start();
    }
    static class CounterRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i < 6; i++) {
                log(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
