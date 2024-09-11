package generic.ex4;

import generic.terran.Marine;
import generic.terran.Tank;

public class TerranMainV3 {
    public static void main(String[] args) {
        Marine marine = new Marine("마린 1 ", 1);
        Tank tank = new Tank("탱크 1", 4);

        TerranMethod.checkup(marine);
        TerranMethod.checkup(tank);

        Marine targetMarine = new Marine("마린 2", 2);
        Marine biggerMarine = TerranMethod.getBigger(marine, targetMarine);
        System.out.println("biggerMarine = " + biggerMarine);
    }
}
// - 결과값 -
// 테란 유닛 이름 : 마린 1
//테란 유닛 레벨 : 1
//마린 출격
//테란 유닛 이름 : 탱크 1
//테란 유닛 레벨 : 4
//탱크 출격
//biggerMarine = Terran{name='마린 2', level=2}