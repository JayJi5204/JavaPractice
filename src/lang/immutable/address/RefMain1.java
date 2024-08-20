package lang.immutable.address;

public class RefMain1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address terran1 = new Address("CommandCenter");
        Address terran2 = terran1;
        //Address terran2 = new Address("CommandCenter"); 로 변경하면 해결가능하다.
        System.out.println("terran1 = " + terran1);
        System.out.println("terran2 = " + terran2);

        terran2.setStructure("Barrack");
        System.out.println("terran1 = " + terran1); //사이드 이펙트 발생
        System.out.println("terran2 = " + terran2);

    }
}
// - 결과값 -
// terran1 = Address{structure='CommandCenter'}
// terran2 = Address{structure='CommandCenter'}
// terran1 = Address{structure='Barrack'}
// terran2 = Address{structure='Barrack'}