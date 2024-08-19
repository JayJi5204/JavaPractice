package access.b;

public class AccessData { // 클래스 레벨
    public int publicField;
    int defaultField;
    private int privateFiled;

    public void publicMethod() {
        System.out.println(publicField);
    }

    void defaultMethod() {
        System.out.println(defaultField);
    }

    private void privateMethod() {
        System.out.println(privateFiled);
    }

    public void innerAccess() {
        publicField = 100;
        defaultField = 200;
        privateFiled = 300;
        publicMethod();
        defaultMethod();
        privateMethod();

    }
}
