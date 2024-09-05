package exception.ex3;

import java.util.Scanner;

public class NetworkMainV3 {
    public static void main(String[] args) {

        //NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

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
// 전송할 문자 : error1
// [연결 오류] 코드 : http://exception.com, 메세지 : http://exception.com 서버 연결 실패
// http://exception.com 서버 연결 해제
//
// 전송할 문자 : error2
// http://exception.com 서버 연결 성공
// [전송 오류] 코드 : http://exception.com 서버에 데이터 전송 실패 : error2, 메세지 : http://exception.com
// http://exception.com 서버 연결 해제
//
// 전송할 문자 : exit
// 프로그램을 정상 종료합니다.