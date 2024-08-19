package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value);
        poly.method();  //메서드 오버라이딩
        //Parent 타입에 있는 method()를 실행하려고 하는데
        //하위 타입인 Child.method()가 오버라이딩 되어있다.
        //오버라이딩 된 메서드는 항상 우선권을 가진다.
        //따라서 Parent.method()가 아니라 Child.method()가 실행된다.
    }
}
// -  결과값 -
// Child -> Child
// value = child
// Child.Method
// Parent -> Parent
// value = parent
// Parent.method
// Parent -> Child
// value = parent
// Child.Method