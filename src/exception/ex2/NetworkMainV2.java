package exception.ex2;


import java.util.Scanner;

public class NetworkMainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2{

        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();

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
// Exception in thread "main" exception.ex2.NetworkClientExceptionV2: http://exception.com 서버 연결 실패
//	at exception.ex2.NetworkClientV2.connect(NetworkClientV2.java:20)
//	at exception.ex2.NetworkServiceV2_1.sendMessage(NetworkServiceV2_1.java:10)
//	at exception.ex2.NetworkMainV2.main(NetworkMainV2.java:18)
//
// 전송할 문자 : error2
// http://exception.com 서버 연결 성공
// Exception in thread "main" exception.ex2.NetworkClientExceptionV2: http://exception.com 서버에 데이터 전송 실패 : error2
//	at exception.ex2.NetworkClientV2.send(NetworkClientV2.java:28)
//	at exception.ex2.NetworkServiceV2_1.sendMessage(NetworkServiceV2_1.java:11)
//	at exception.ex2.NetworkMainV2.main(NetworkMainV2.java:18)