package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        // 내부 클래스는 바깥 클래스의 인스턴스 정보를 알아야 생성할 수 있다.
        InnerOuter outer = new InnerOuter();
        // 내부 클래스는 바깥 클래스의 인스턴스에 소속된다.
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();
    }
}
// - 결과값 -
// 1
// 2
// 3