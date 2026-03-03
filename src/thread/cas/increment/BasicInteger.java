package thread.cas.increment;

public class BasicInteger implements IncrementInteger {
    private int value;

    @Override
    public void increment() {
        value += 1;
    }

    @Override
    public int get() {
        return value;
    }
}
