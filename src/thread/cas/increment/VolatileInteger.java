package thread.cas.increment;

public class VolatileInteger implements IncrementInteger {
    private volatile int value;

    @Override
    public void increment() {
        value += 1;
    }

    @Override
    public int get() {
        return value;
    }
}
