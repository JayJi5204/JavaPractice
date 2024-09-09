package generic.ex3;

import generic.terran.Tank;

public class FactoryV0 {
    private Tank terran;

    public void set(Tank terran) {
        this.terran = terran;
    }

    // 탱크의 이름과 크기를 출력하고 sound() 메서드 호출
    public void checkup() {
        System.out.println("탱크 이름 : " + terran.getName());
        System.out.println("탱크 레벨 : " + terran.getLevel());
        terran.sound();
    }

    // 다른 탱크와 크기를 비교한다. 둘 중 레벨이 높은 탱크를 반환
    public Tank bigger(Tank target) {
        return terran.getLevel() > target.getLevel() ? terran : target;
    }
}
