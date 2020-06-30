package model;

public class IntValue {
    private int value;

    public IntValue() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }
}
