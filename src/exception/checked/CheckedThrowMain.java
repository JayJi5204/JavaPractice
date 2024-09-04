package exception.checked;

public class CheckedThrowMain {
    // 예외가 main() 밖으로 던져진다.
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        /*
        service.callThrow()안에서 예외를 처리하지 않고
        밖으로 던졌기 때문에 예외가 main() 메서드까지 올라왔다.
         */
        service.callThrow();
        /*
        예외를 잡아서 처리하지 못했기 때문에
        "정상 종료"가 출력되지 않는다
         */
        System.out.println("정상 종료");
    }
}
// - 결과값 -
// Exception in thread "main" exception.checked.MyCheckedException: ex
//	at exception.checked.Client.call(Client.java:8)
//	at exception.checked.Service.callThrow(Service.java:34)
//	at exception.checked.CheckedThrowMain.main(CheckedThrowMain.java:6)
