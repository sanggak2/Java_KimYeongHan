package thread.volitile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        new Thread(task).start();

        sleep(1000);

        task.flag = false;
        log("flag = " + task.flag + ", count = " + task.count +"in main");
    }

    static class MyTask implements Runnable {
        volatile boolean flag = true;
        volatile long count;


        @Override
        public void run() {
            while(flag){
                count++;
                // 1억번에 한 번
                if (count % 100_000_000 == 0) {
                    //여기에서 출력하기 때문에 컨텍스트 스위칭이 일어나면서 캐시메모리값이 갱신! (확실한건 아님)
                    log("flag = " + flag + ", count = " + count);
                }
            }
            log("flag = " + flag + ", count = " + count +" 종료");
        }
    }
}
