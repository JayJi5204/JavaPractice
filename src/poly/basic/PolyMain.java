package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> parent");
        Parent parent = new Parent();
        // 부모 타입인 Parent를 생성했기 때문에 Parent만 생성된다.
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        // 자식 타입인 Child를 생성했기 때문에 Child와 Parent가 모두 생성된다.
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        // 자식 타입인 Child를 생성했기 때문에 Child와 Parent가 모두 생성된다.
        poly.parentMethod();
        //poly.childMethod(); 자식의 기능은 호출할 수 없다
        //자식의 기능을 사용하려면 캐스팅이 필요하다.

        //Child child = new Parent(); 자식타입은 부모타입을 담을 수 없다
    }
}
// - 결과값 -
// Parent -> parent
// Parent.parentMethod
// Child -> Child
// Parent.parentMethod
// Child.childMethod
// Parent -> Child
// Parent.parentMethod
