package exception.ex3;

/**
 * 전송 실패시 발생하는 예외
 * 내부에 전송을 시도한 sendData를 보관
 * NetworkClientExceptionV3 상속
 */
public class SendExceptionV3 extends NetworkClientExceptionV3 {
    private final String sendData;

    public SendExceptionV3(String message, String sendData) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
