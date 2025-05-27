package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출전");
        helloThread.start(); //항상 스레드 실행할땐 run 말고 start. (스택공간을 만들어주고 운영체제에 알려주고 등등)
//        helloThread.run(); // 이러면 main스레드가 helloThread에 run실행.
        System.out.println(Thread.currentThread().getName() + ": start() 호출후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
