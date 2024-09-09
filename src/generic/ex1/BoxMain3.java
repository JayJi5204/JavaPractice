package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        // 생성 시점에 T의 타입 결정
        GenericBox<Integer> integerBox = new GenericBox<>();
        integerBox.setValue(10);
        //integerBox.setValue("hello"); // Integer 타입만 허용
        Integer integer = integerBox.getValue(); // Integer 타입 반환
        System.out.println("Integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setValue("hello");
        //stringBox.setValue(10); // String 타입만 허용
        String string = stringBox.getValue(); // String 타입 반환
        System.out.println("String = " + string);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.setValue(5.5);
        Double doubleValue = doubleBox.getValue();
        System.out.println("DoubleValue = " + doubleValue);

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}
// - 결과값 -
// Integer = 10
// String = hello
// DoubleValue = 5.5