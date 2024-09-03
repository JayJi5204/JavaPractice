package nested.anonymous;

import java.util.Random;

public class Ex1MainV2 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        process.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");

    }

    public static void main(String[] args) {
        class Dice implements Process {

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        }

        class Sum implements Process {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }

        Process dice = new Dice();
        Process sum = new Sum();

        hello(dice);
        hello(sum);
    }
}
// - 결과값 -
// 프로그램 시작
// 주사위 = 6
// 프로그램 종료
// 프로그램 시작
// i = 0
// i = 1
// i = 2
// 프로그램 종료