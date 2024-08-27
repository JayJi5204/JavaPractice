package lang.string.method;

public class StrtingUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println("숫자의 문자열 값 : " + numString);
        String boolString = String.valueOf(bool);
        System.out.println("불리언의 문자열 값 : " + boolString);
        String objString = String.valueOf(obj);
        System.out.println("객체의 문자열 값 : " + objString);
        String numString2 = "" + num;
        System.out.println("빈문자열 + num : " + numString2);

        //toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 : " + strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
// - 결과값 -
// 숫자의 문자열 값 : 100
// 불리언의 문자열 값 : true
// 객체의 문자열 값 : java.lang.Object@2f4d3709
// 빈문자열 + num : 100
// 문자열을 문자 배열로 변환 : [C@4e50df2e
// Hello, Java!