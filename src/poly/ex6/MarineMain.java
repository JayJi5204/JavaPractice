package poly.ex6;

public class MarineMain {
    public static void main(String[] args) {
        InterfaceUnitA a = new Marine();
        a.move();
        a.attack();

        InterfaceUnitB b = new Marine();
        b.stop();
        b.attack();
    }
}
// - 결과값 -
// Marine 이동
// Marine 공격
// Marine 정지
// Marine 공격