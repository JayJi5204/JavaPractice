package exception.checked;

/**
 * Checked 예외는 예외를 잡아서 처리하거나,
 * 던지거나 둘중 하나를 필수로 선택해야 한다.
 */

public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch() {
        try {
            client.call();
            /*
              try에서 잡은 예외가 catch의 대상에 없으면 잡을 수 없다.
              catch에 예외를 지정하면 해당 예외와 그 하위 타입 예외를 모두 잡아준다.
             */
        } catch (MyCheckedException e) {
            // 예외 처리 로직
            System.out.println("예외 처리, message = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면
     * throws 예외를 메서드에 필수로 선언해야 한다.
     * 예외를 밖으로 던지는 경우에도
     * 해당 타입과 그 하위 타입을 모두 던질 수 있다.
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
