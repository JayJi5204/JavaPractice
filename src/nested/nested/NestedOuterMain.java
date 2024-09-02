package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        // 정적 중첩 클래스는 new 바깥클래스.중첩클래스()로 생성할 수 있다.
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();
        // 중첩 클래스는 바깥클래스.중첩클래스로 접근할 수 있다.
        System.out.println("nestedClass = " + nested.getClass());
    }
}
// - 결과값 -
// 1
// 3
// nestedClass = class nested.nested.NestedOuter$Nested