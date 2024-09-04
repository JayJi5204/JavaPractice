package exception.ex2;

public class NetworkServiceV2_2 {
    public void sendMessage(String data) {
        String address = "http://exception.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);
        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            // 예외를 잡으면 오류 코드와 예외 메세지를 출력한다.
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }
        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            // 예외를 잡으면 오류 코드와 예외 메세지를 출력한다.
            System.out.println("[오류] 코드 : " + e.getErrorCode() + ", 메세지 : " + e.getMessage());
            return;
        }
        client.disconnect();
    }
}
