package lang.object.poly;

public class ObjectArray {
    public static void main(String[] args) {

        Marine marine = new Marine();
        Zergling zergling = new Zergling();

        Object object = new Object(); //Object도 인스턴스를 만들 수 있다.

        Object[] objects = {marine, zergling, object};
        /*
        Object objects[0] = new Marine();
        Object objects[1] = new Zergling();
        Object objects[2] = new Object();
         */
        size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("객체의 수 : " + objects.length);
    }
}
// - 결과값 -
// 객체의 수 : 3
