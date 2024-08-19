package extends1.super1;

public class SuperMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.call();
    }
}
// - 결과값 -
//Value = child
//Value = parent
//Child.hello
//Parent.hello