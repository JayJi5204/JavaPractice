package static1;

public class DecoData {
    private static int staticValue; // 정적 변수(클래스 변수)이다.
    private int instanceValue; // 인스턴스 변수이다.

    public static void staticCall() {
        //instanceValue++; 인스턴스 변수 접근, 컴파일 에러
        //instanceMethod(); 인스턴스 메서드 접근, 컴파일 에러
        staticValue++;
        staticMethod();
    }

    private static void staticMethod() { // 정적 메서드(클래스 메서드)이다.
        System.out.println("static : " + staticValue);
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() { // 인스턴스 메서드이다.
        System.out.println("instance : " + instanceValue);
    }
}
