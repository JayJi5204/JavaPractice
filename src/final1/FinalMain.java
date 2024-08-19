package final1;

public class FinalMain {
    public static void main(String[] args) {
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value); // 10
        System.out.println(constructInit2.value); // 20

        FieldInit fieldInit = new FieldInit();
        System.out.println(fieldInit.value); // 200
        System.out.println(FieldInit.CONST_VALUE); //100
    }
}
// - 결과값 -
// 10
// 20
// 200
// 100