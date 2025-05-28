package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread(new MyRunnable(), "myThread");
        log("myThread.state1: " + myThread.getState()); //RUNNABLE
        log("myThread.start()");
        myThread.start();
        Thread.sleep(1000);
        log("myThread.state3: " + myThread.getState()); //TIMEDWAITING
        Thread.sleep(4000);
        log("myThread.state4: " + myThread.getState()); //TERMINATED
        log("end");
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                log("start");
                log("myThread.state2: " + Thread.currentThread().getState()); // RUNNABLE
                Thread.sleep(3000);
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
