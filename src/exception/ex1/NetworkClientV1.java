package exception.ex1;

public class NetworkClientV1 {
    // 접속할 외부 서버 주소
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    // 외부 서버에 연결
    public String connect() {
        // connectError의 값이 true가 되면 연결 실패 및 오류 코드 반환
        if (connectError) {
            System.out.println(address + " 서버 연결 실패");
            return "connectError";
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    // 연결한 외부 서버에 데이터 전송
    public String send(String data) {
        // sendError의 값이 true가 되면 연결 실패 및 오류 코드 반환
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패 : " + data);
            return "sendError";
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송 : " + data);
        return "success";
    }

    //외부 서버와 연결을 해제
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        // 사용자 입력 값에 error1이 있으면 connectError 오류
        if (data.contains("error1")) {
            connectError = true;
        }
        // 사용자 입력 값에 error2가 있으면 sendError 오류
        if (data.contains("error2")) {
            sendError = true;
        }
    }

}
