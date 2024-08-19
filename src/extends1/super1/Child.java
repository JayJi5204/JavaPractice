package extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("Value = " + this.value);
        //this는 자기 자신 참조 (생략가능)
        System.out.println("Value = " + super.value);
        //super는 부모 클래스에 대한 참조

        this.hello();
        super.hello();
        //super를 사용한 경우 부모 클래스의 기능 사용
    }
}
