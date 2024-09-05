package exception.ex4;

import java.util.Scanner;

public class NetworkMainV4 {

    public static void main(String[] args) {

        //NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        //NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) { // 모든 예외를 잡아서 처리
                exceptionHandler(e);
            } System.out.println();
        } System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        // 해결할 수 없는 예외가 발생하면 사용자에게 알리는 것이 좋다.
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        // 개발자는 빨리 문제를 찾고 디버깅 할 수 있도록 오류 메세지를 남겨두어야 한다.
        System.out.println(" - 개발자용 디버깅 메세지 -");
        // 예외가 발생한 지점을 역으로 추적할 수 있다.
        e.printStackTrace(System.out); // 스택 트레이스 출력
        //e.printStackTrace(); //S ystem.err에 스택 트레이스 출력

        // 예외도 객체이므로 예외 객체의 타입을 확인해서
        // 별로 별도의 추가 처리 할 수 있다.
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSendData());
        }
    }
}
// - 결과값 -
// 전송할 문자 : hello
// http://exception.com 서버 연결 성공
// http://exception.com 서버에 데이터 전송 : hello
// NetworkClientV5.close
// http://exception.com 서버 연결 해제
//
// 전송할 문자 : error1
// NetworkClientV5.close
// http://exception.com 서버 연결 해제
// [예외 확인] : http://exception.com 서버 연결 실패
// 사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.
// - 개발자용 디버깅 메세지 -
// exception.ex4.ConnectExceptionV4: http://exception.com 서버 연결 실패
//	at exception.ex4.NetworkClientV5.connect(NetworkClientV5.java:16)
//	at exception.ex4.NetworkServiceV5.sendMessage(NetworkServiceV5.java:10)
//	at exception.ex4.NetworkMainV4.main(NetworkMainV4.java:21)
//
// 전송할 문자 : error2
// http://exception.com 서버 연결 성공
// NetworkClientV5.close
// http://exception.com 서버 연결 해제
// [예외 확인] : error2
// 사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.
// - 개발자용 디버깅 메세지 -
// exception.ex4.SendExceptionV4: error2
//	at exception.ex4.NetworkClientV5.send(NetworkClientV5.java:25)
//	at exception.ex4.NetworkServiceV5.sendMessage(NetworkServiceV5.java:11)
//	at exception.ex4.NetworkMainV4.main(NetworkMainV4.java:21)
// [전송 오류] 전송 데이터 : http://exception.com 서버에 데이터 전송 실패 : error2
//
// 전송할 문자 : exit
// 프로그램을 정상 종료합니다.