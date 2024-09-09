package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setValue(10);
        // Object -> Integer 다운 캐스팅
        Integer integer = (Integer) integerBox.getValue();
        System.out.println("Integer = " + integer);

        ObjectBox StringBox = new ObjectBox();
        StringBox.setValue("hello");
        // Object -> String 다운 캐스팅
        String string = (String) StringBox.getValue();
        System.out.println("String = " + string);

        // 잘못된 타입의 인수 전달
        integerBox.setValue("문자입니다.");
        // String -> Integer 예외 발생
        Integer result = (Integer) integerBox.getValue();
        System.out.println("result = " + result);
    }
}
// - 결과값 -
// Integer = 10
// String = hello
// Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//	at generic.ex1.BoxMain2.main(BoxMain2.java:20)