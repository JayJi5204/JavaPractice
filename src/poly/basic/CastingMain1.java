package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 면수가 자식 인스턴스 참조
        Parent poly = new Child();
        //poly.childMethod(); 자식의 기능은 호출할 수 없다.

        //다운캐스팅( 부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod();
    }
}
// - 결과값-
// Child.childMethod
