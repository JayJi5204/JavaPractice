package generic.ex3;

import generic.terran.Tank;
import generic.terran.Marine;

public class TerranMainV0 {
    public static void main(String[] args) {

        BarracksV0 barracks = new BarracksV0();
        FactoryV0 factory = new FactoryV0();

        Marine marine = new Marine("마린 1 ", 1);
        Tank tank = new Tank("탱크 1", 4);

        // 배럭스
        barracks.set(marine);
        barracks.checkup();

        // 팩토리
        factory.set(tank);
        factory.checkup();

        // 오류 1 : 배럭에 탱크 전달
        //barracks.set(tank); // 다른 타입 입력

        // 오류 2 : 마린 타입 반환
        barracks.set(marine);
        Marine biggerMarine = barracks.bigger(new Marine("마린 2", 2));
        System.out.println("biggerMarine = " + biggerMarine);
    }
}
// - 결과값 -
// 마린 이름 : 마린 1
// 마린 레벨 : 1
// 마린 출격
// 탱크 이름 : 탱크 1
// 탱크 레벨 : 4
// 탱크 출격
// biggerMarine = Terran{name='마린 2', level=2}