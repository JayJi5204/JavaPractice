package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString()은 Object 클래스의 메서드이다. 객체의 정보를 제공한다.
        String string = child.toString();
        System.out.println(string);

    }
}
// - 결과값 -
// Child.childMethod
// Parent.parentMethod
// lang.object.Child@2f4d3709