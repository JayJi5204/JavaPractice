package exception.ex1;


public class NetworkServiceV1 {
    public void sendMessage(String data) {
        String address = "http://exception.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 입력 기반 오류 활성화
        client.connect(); // 서버와 연결
        client.send(data); // 연견된 서버에 메세지 전송
        client.disconnect(); // 연결 해제
        // connect()가 실패한 경우 send()를 호출하면 안됨
        // 사용 후 반드시 disconnect()를 호출해서 연결 해제
    }
}
