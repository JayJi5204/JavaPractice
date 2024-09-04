package exception.ex1;

public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://exception.com");
        client.initError(data);
        String connectResult = client.connect();
        if (isError(connectResult)) {
            // 오류 발생시 오류 코드 출력
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
            // 오류 발생시 return을 사용해 중지
            return;
        }
        String sendResult = client.send(data);
            // 오류 발생시 오류 코드 출력
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            // 오류 발생시 return을 사용해 중지
            return;
        }
        client.disconnect();
    }
    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
