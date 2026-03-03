package thread.cas.increment;

public class SyncInteger implements IncrementInteger {
    private int value;

    @Override
    public synchronized void increment() {
        value += 1;
    }

    @Override
    public synchronized int get() {
        return value;
    }
}
