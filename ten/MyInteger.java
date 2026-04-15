public class MyInteger {

    private int value;

    public int getValue() {
        return value;
    }

    MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    static public boolean isEven(MyInteger myInt) {
        return myInt.getValue() % 2 == 0;
    }

    static public boolean isOdd(MyInteger myInt) {
        return myInt.getValue() % 2 != 0;
    }

    public boolean equals(MyInteger myInt) {
        return this.value == myInt.getValue();
    }

    public boolean equals(int value) {
        return this.value == value;
    }

}
