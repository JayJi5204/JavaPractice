package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        int i2 = compareTo(value, 10);
        int i3 = compareTo(value, 20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
    // 외부 메서드를 사용해서 비교
    // value와 다른 값을 연산하는 것이기 때문에
    // 항상 자기 자신의 값인 value 사용
    private static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
// - 결과값 -
// i1 = 1
// i2 = 0
// i3 = -1
