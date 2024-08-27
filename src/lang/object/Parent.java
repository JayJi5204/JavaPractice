package lang.object;
// 클래스에 상속 받을 부모 클래스가 없으면 묵시적으로 Object 클래스를 상속받는다.
public class Parent { // public class Parent extends Object와 같다.
    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}