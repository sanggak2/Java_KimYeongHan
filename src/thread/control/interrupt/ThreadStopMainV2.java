package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1 : "+thread.isInterrupted());
    }
    static class MyTask implements Runnable {
        @Override
        public void run() {
            try {
                while(true) {
                    log("작업중");         //인터럽트 걸어도 얘를 실행하고있으면 바로 안빠져나옴
                    Thread.sleep(3000); //sleep같이 inturruptedException이 발생하는 메서드거나 이미 호출하고 대기중일때 작동
                }
            } catch (InterruptedException e) {
                //여기서는 RUNNABLE상태여야 코드를 실행할 수 있겠죠
                log("work스레드 인터럽트 상태2 : "+Thread.currentThread().isInterrupted());
                log("interrupt message : "+e.getMessage());
                log("state : "+Thread.currentThread().getState());
            }

            log("자원정리");
            log("종료");
        }
    }
}
