package exception.ex3;


public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    /**
     * 오류가 발생했을 때
     * 오류 코드를 반환하는 것이 아나라 예외를 던진다
     * 따라서 반환 값을 사용하지 않아도 된다.(void로 처리)
     */
    public void connect() throws ConnectExceptionV3 {
        if (connectError) {
            // 연결 관련 오류 발생시 ConnectExceptionV3를 던짐
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) throws SendExceptionV3 {
        if (sendError) {
            // 연결 관련 오류 발생시 SendExceptionV3를 던짐
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패 : " + data);
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
