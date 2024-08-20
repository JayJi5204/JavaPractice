package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress terran1 = new ImmutableAddress("CommandCenter");
        ImmutableAddress terran2 = terran1;

        System.out.println("terran1 = " + terran1);
        System.out.println("terran2 = " + terran2);

        //terran2.setStructure("Barrack"); //컴파일 오류 발생
        //setStructure가 없기 때문에 새로운 ImmutableAddress 인스턴스 생성
        terran2 = new ImmutableAddress("Barrrack"); //다른 인스턴스 참조
        System.out.println("Barrack -> terran2");
        System.out.println("terran1 = " + terran1);
        System.out.println("terran2 = " + terran2);
    }
}
// - 결과값 -
// terran1 = ImmutableAddress{structure='CommandCenter'}
// terran2 = ImmutableAddress{structure='CommandCenter'}
// Barrack -> terran2
// terran1 = ImmutableAddress{structure='CommandCenter'}
// terran2 = ImmutableAddress{structure='Barrrack'}