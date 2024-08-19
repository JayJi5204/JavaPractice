package scope;

public class Scope1 {
    public static void main(String[] args) {

        long longValue = 2147483648L;
        int maxIntValue = (int) longValue;
        System.out.println(maxIntValue);
    } //int형이 표현할 수 있는 범위를 초과해서 표현하게 되면 오버플로우가 발생하게 된다.
}
// - 결과값 -
// -2147483648