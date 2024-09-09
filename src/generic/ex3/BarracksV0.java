package generic.ex3;

import generic.terran.Marine;

public class BarracksV0 {
    private Marine terran;

    public void set(Marine terran) {
        this.terran = terran;
    }

    // 마린의 이름과 크기를 출력하고 sound() 메서드 호출
    public void checkup() {
        System.out.println("마린 이름 : " + terran.getName());
        System.out.println("마린 레벨 : " + terran.getLevel());
        terran.sound();
    }

    // 다른 마린과 크기를 비교한다. 둘 중 레벨이 높은 마린을 반환
    public Marine bigger(Marine target) {
        return terran.getLevel() > target.getLevel() ? terran : target;
    }
}
