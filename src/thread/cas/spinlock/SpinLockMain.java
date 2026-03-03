package thread.cas.spinlock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class SpinLockMain {
    public static void main(String[] args) {
        SpinLock spinlock = new SpinLock();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                spinlock.lock();
                try {
                    // critical section
                    log("비즈니스 로직 실행");
                    sleep(1);   // 오래 걸리는 로직에선 스핀락 안된다!!
                } finally {
                    spinlock.unlock();
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

    }
}
