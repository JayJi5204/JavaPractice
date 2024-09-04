package exception.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        /**
         * super(message)로 전달한 메세지는
         * Throwable에 있는 detailMessage에 보관된다.
         * getMessage()를 통해 조회할 수 있다.
         */
        super(message);
    }
}
