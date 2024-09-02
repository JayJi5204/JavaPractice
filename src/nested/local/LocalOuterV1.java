package nested.local;

public class LocalOuterV1 {

    // 바깥 클래스의 인스턴스 멤버에 접근 가능
    private int outInstanceVar = 3;

    public static void main(String[] args) {
        LocalOuterV1 localOuterV1 = new LocalOuterV1();
        localOuterV1.process(2);
    }

    // 자신이 속한 코드 블럭의 매개변수에 접근 가능
    public void process(int paramVar) {

        // 자신이 속한 코드 블럭의 지역 변수에 접근 가능
        int lovalVar = 1;
        class LocalPrinter {

            // 자신의 인스턴스 변수에 접근 가능
            int value = 0;

            public void printData() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + lovalVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }
}
// - 결과값 -
// value = 0
// localVar = 1
// paramVar = 2
// outInstanceVar = 3
