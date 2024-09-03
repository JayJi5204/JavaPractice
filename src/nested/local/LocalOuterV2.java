package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public static void main(String[] args) {
        LocalOuterV2 localOuterV2 = new LocalOuterV2();
        localOuterV2.process(2);
    }

    public void process(int paramVar) {
        int localVar = 1;
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }
        Printer printer = new LocalPrinter();
        printer.print();
    }
}
// - 결과값 -
// value = 0
// localVar = 1
// paramVar = 2
// outInstanceVar = 3