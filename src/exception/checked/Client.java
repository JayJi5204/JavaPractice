package exception.checked;

public class Client {
    // throws 예외는 발생시킨 예외를 메서드 밖으로 던질 때 사용한다.
    public void call() throws MyCheckedException {
        // throw 예외는 새로운 예외를 발생시킬 수 있다.
        // 예외도 객체이기 떄문에 객체를 먼저 new로 생성하고 예외를 발생시켜야 한다.
        throw new MyCheckedException("ex");
    }
}
