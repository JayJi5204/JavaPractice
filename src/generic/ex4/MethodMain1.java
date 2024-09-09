package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objectMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>genericMethod(10);
        Double doubleValue = GenericMethod.<Double>genericMethod(20.0);
    }
}
// - 결과값 -
// object print : 10
// 명시적 타입 인자 전달
// generic print : 10
// generic print : 10
// generic print : 20.0
