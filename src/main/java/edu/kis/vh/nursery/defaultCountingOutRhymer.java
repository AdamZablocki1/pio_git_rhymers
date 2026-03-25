package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int CAPACITY = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;

    private final int[] NUMBERS = new int[CAPACITY];

    public int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == CAPACITY - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY_RHYMER_INDICATOR;
        return NUMBERS[total--];
    }
}