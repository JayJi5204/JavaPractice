package lang.wrapper;

public class MyIntegerMethodMain2 {
    public static void main(String[] args) {
        // MyInteger는 객체이므로 메서드를 편리하게 호출 가능
        MyInteger myInteger = new MyInteger(10);
        // 자기 자신의 값을 외부의 값과 비교
        int i1 = myInteger.compareTo(5);
        int i2 = myInteger.compareTo(10);
        int i3 = myInteger.compareTo(20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
// - 결과값 -
// i1 = 1
// i2 = 0
// i3 = -1