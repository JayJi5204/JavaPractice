package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        int value = 7;
        Integer boxedValue = value; // 오토 박싱

        int unboxedValue = boxedValue;   // 오토 언박싱
        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
// - 결과값 -
// boxedValue = 7
// unboxedValue = 7
