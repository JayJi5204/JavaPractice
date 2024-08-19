package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); //ClassB(int a, int b)생성자 선택
        //ClassB에는 기본 생성자가 없기때문에 super()를 사용하거나 생략불가
        System.out.println("ClassC 생성자");
    }
}
