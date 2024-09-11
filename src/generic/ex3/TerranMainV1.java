package generic.ex3;

import generic.terran.Marine;
import generic.terran.Tank;

public class TerranMainV1 {
    public static void main(String[] args) {

        TerranUnitV1 barracks = new TerranUnitV1();
        TerranUnitV1 factory = new TerranUnitV1();

        Marine marine = new Marine("마린 1 ", 1);
        Tank tank = new Tank("탱크 1", 4);

        // 배럭스
        barracks.set(marine);
        barracks.checkup();

        // 팩토리
        factory.set(tank);
        factory.checkup();

        // 오류 1 : 배럭에 탱크 전달
        //barracks.set(tank); // 매개변수 체크 실패

        // 오류 2 : 마린 타입 반환, 캐스팅 필요
        barracks.set(marine);
        Marine biggerMarine = (Marine) barracks.getBigger(new Marine("마린 2", 2));
        System.out.println("biggerMarine = " + biggerMarine);
    }
}
// - 결과값 -
// 테란 유닛 이름 : 마린 1
// 테란 유닛 레벨 : 1
// 마린 출격
// 테란 유닛 이름 : 탱크 1
// 테란 유닛 레벨 : 4
// 탱크 출격
// biggerMarine = Terran{name='마린 2', level=2}