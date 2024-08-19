package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //scanner 변수 선언

        System.out.print("문자열을 입력해주세요 : ");    //print : 출력하고 다음 라인으로 넘기지 않는다.
        String str = scanner.nextLine();    //엔터(\n)를 입력할 때 까지 문자를 가져옵니다.
        System.out.println(str);    //println : 출력하고 다음 라인으로 넘깁니다.

        System.out.print("정수를 입력해주세요 : ");
        int intValue = scanner.nextInt();   //입력을 int로 가져옵니다.
        System.out.println(intValue);
    }
}
// - 입력값 -
// Hello
// 1
// - 출력값 -
// Hello
// 1
