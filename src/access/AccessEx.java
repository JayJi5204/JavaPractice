package access;

public class AccessEx {
    private int testInt;

    public AccessEx() {
        testInt = 0;
    }

    public void add(int testX) {
        testInt += testX;
    }

    public void discount(int testX) {
        testInt -= testX;
    }

    public int getTestInt() {
        return testInt;
    }
}
