package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "Terran";
        String b = " Marine";

        //문자열을 더할 때 concat()메서드를 사용한다.
        String result1 = a.concat(b);
        //문자열은 자주 다루어지기 때문에 + 연산을 제공한다.
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
// - 결과값 -
// result1 = Terran Marine
// result2 = Terran Marine