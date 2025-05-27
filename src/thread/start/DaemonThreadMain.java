package thread.start;

public class DaemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");
        DemonThread demonThread = new DemonThread();
        demonThread.setDaemon(false); // 데몬스레드 여부 기본은 user스레드.(false)
        demonThread.start();
        System.out.println(Thread.currentThread().getName() + " : main() end");
        //main스레드가 데몬스레드가 10초간 기다리는중에 끝나서 JVM꺼버림. = 프로그램 끝남
    }
    static class DemonThread extends Thread {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " : run() start");
            try {
                //이 sleep 무조건 try-catch써야됨
                Thread.sleep(10000); //10초 기다리기
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : run() end");
        }
    }
}
