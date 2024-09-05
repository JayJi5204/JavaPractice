package exception.ex2;

public class NetworkServiceV2_3 {
    public void sendMessage(String data) {
        String address = "http://exception.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);
        try { // 정상 흐름을 모두 담음
            client.connect();
            client.send(data);
            client.disconnect(); // 예외 발생시 무시
        } catch (NetworkClientExceptionV2 e) { // 예외 흐름을 모두 담음
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
        }
    }
}
