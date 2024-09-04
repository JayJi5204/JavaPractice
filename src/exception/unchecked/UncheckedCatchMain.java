package exception.unchecked;

public class UncheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");
    }
}
// - 결과값 -
// Exception in thread "main" exception.unchecked.MyUncheckedException: ex
//	at exception.unchecked.Client.call(Client.java:5)
//	at exception.unchecked.Service.callThrow(Service.java:30)
//	at exception.unchecked.UncheckedCatchMain.main(UncheckedCatchMain.java:6)