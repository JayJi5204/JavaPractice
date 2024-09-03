package nested.anonymous;

import java.util.Random;

public class Ex0Main {
    public static void helloDice() {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        // 코드 조각 시작
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("주사위 = " + randomValue);
        // 코드 조각 종료
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    public static void helloSum() {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        // 코드 조각 시작
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        // 코드 조각 종료
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
// - 결과값 -
// 프로그램 시작
// 주사위 = 2
// 프로그램 종료
// 프로그램 시작
// i = 0
// i = 1
// i = 2
// 프로그램 종료