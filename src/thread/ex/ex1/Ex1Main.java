package thread.ex.ex1;

import static util.MyLogger.log;

public class Ex1Main {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }
    static class CounterThread extends Thread {
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
