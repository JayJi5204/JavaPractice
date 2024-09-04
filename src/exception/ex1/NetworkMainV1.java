package exception.ex1;

import java.util.Scanner;

public class NetworkMainV1 {
    public static void main(String[] args) {
        //NetworkServiceV1 networkService = new NetworkServiceV1();
        //NetworkServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

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
// http://exception.com 서버 연결 실패
// [네트워크 오류 발생] 오류 코드 : connectError
// http://exception.com 서버 연결 해제
//
// 전송할 문자 : error2
// http://exception.com 서버 연결 성공
// http://exception.com 서버에 데이터 전송 실패 : error2
// [네트워크 오류 발생] 오류 코드 : sendError
// http://exception.com 서버 연결 해제
//
// 전송할 문자 : exit
// 프로그램을 정상 종료합니다.