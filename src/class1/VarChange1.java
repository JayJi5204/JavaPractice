package class1;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a; // a의 값 복사 후 대입
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        a = 20; // a값 변경, b에는 영향을 끼치지 않는다.
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10

        b = 30; // b값 변경
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
    }
}
// - 결과값 -
// 10
// 10
// 20
// 10
// 20
// 30