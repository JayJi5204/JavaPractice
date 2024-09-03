package nested.anonymous;

import java.util.Random;

public class Ex1MainV1 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");

    }

    static class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
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