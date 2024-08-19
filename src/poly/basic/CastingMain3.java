package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("- parent1 -");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("- parent2 -");
        call(parent2);
    }

    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            System.out.println("- Child -");
            child.childMethod();
        }
    }
}
// - 결과값 -
// - parent1 -
// Parent.parentMethod
// - parent2 -
// Parent.parentMethod
// - Child -
// Child.childMethod