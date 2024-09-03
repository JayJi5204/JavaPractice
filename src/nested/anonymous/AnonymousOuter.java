package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private final int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;
        Printer printer = new Printer() {

            final int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };
        printer.print();
    }
    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}
// - 결과값 -
// value = 0
// localVar = 1
// paramVar = 2
// outInstanceVar = 3
