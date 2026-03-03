package thread.cas.increment;


public class IncrementPerformanceMain {
    public static final int THREAD_COUNT = 100_000_000;
    public static void main(String[] args) throws InterruptedException {
        test(new BasicInteger());
        test(new VolatileInteger());
        test(new SyncInteger());
        test(new MyAtomicInteger());
    }
    private static void test(IncrementInteger i) throws InterruptedException {
        long start = System.currentTimeMillis();

        for (int j = 0; j < THREAD_COUNT; j++) {
            i.increment();
        }
        long end = System.currentTimeMillis();
        System.out.println(i.getClass().getSimpleName() + ": ms=" + (end - start));

    }
}
