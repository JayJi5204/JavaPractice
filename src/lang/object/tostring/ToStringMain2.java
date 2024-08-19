package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Marine marine = new Marine("Raynor");
        Zergling zergling1 = new Zergling("Zergling1", 2);
        Zergling zergling2 = new Zergling("Zergling2", 5);

        System.out.println("단순 toString 호출");
        System.out.println(marine);
        System.out.println(zergling1);
        System.out.println(zergling2);

        System.out.println("println 내부에서 toString 호출");
        System.out.println(marine);
        System.out.println(zergling1);
        System.out.println(zergling2);

        System.out.println("Object 다형성 활용");
        ObjectPrinter.print(marine);
        ObjectPrinter.print(zergling1);
        ObjectPrinter.print(zergling2);
    }
}
// - 결과값 -
// 단순 toString 호출
// lang.object.tostring.Marine@2f4d3709
// ZerglingName : Zergling1, count : 2
// ZerglingName : Zergling2, count : 5
// println 내부에서 toString 호출
// lang.object.tostring.Marine@2f4d3709
// ZerglingName : Zergling1, count : 2
// ZerglingName : Zergling2, count : 5
// Object 다형성 활용
// Unit 정보 : lang.object.tostring.Marine@2f4d3709
// Unit 정보 : ZerglingName : Zergling1, count : 2
// Unit 정보 : ZerglingName : Zergling2, count : 5
