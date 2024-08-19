package access;

public class AccessExMain {
    public static void main(String[] args) {
        AccessEx accessEx = new AccessEx();
        accessEx.add(10);
        accessEx.discount(5);
        System.out.println(accessEx.getTestInt());
    }
}
// - 결과값 -
// 5
