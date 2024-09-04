package exception.ex0;

import java.util.Scanner;

public class NetworkMainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 networkService = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
// - 결과값 -
// 전송할 문자 : hello
// http://exception.com 서버 연결 성공
// http://exception.com 서버에 데이터 전송 : hello
// http://exception.com 서버 연결 해제
//
// 전송할 문자 : exit
// 프로그램을 정상 종료합니다.