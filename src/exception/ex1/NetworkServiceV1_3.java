package exception.ex1;

public class NetworkServiceV1_3 {

    public void sendMessage(String data) {
        NetworkClientV1 client = new NetworkClientV1("http://exception.com");
        client.initError(data);
        // 정상 흐름 + 예외 흐름
        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드 : " + connectResult);
        } else { //else문을 사용해 return 제거
            // connect()가 성공해야 send()를 호출
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드 : " + sendResult);
            }
        }
        // return이 없어서 disconnect() 호출 가능
        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
