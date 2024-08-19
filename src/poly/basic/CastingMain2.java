package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child;
        Parent parent2 = child; //업캐스팅은 생략 가능하다
        //다운캐스팅은 생략이 불가능하다.
        parent1.parentMethod();
        parent2.parentMethod();
    }
}
// - 결과값 -
//Parent.parentMethod
//Parent.parentMethod
