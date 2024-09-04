package exception.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        // service.callCatch()에서 예외를 처리했기 때문에
        // main() 메서드까지 예외가 올라오지 않는다.
        service.callCatch();
        System.out.println("정상 종료");
    }
}
// - 결과값 -
// 예외 처리, message = ex
// 정상 흐름
// 정상 종료