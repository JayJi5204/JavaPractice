package collection.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        //stringList에는 String 문자열만 보관
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println("string = " + string);

        //intList에는 Integer 숫자열만 보관
        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Integer integer = intList.get(0);
        System.out.println("integer = " + integer);

    }
}
// - 결과값 -
// string = a
// integer = 1