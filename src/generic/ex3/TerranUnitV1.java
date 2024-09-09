package generic.ex3;

import generic.terran.Terran;

public class TerranUnitV1 {
    private Terran terran;

    public void set(Terran terran) {
        this.terran = terran;
    }

    // getName()과  getLevel()은 Terran 타입이 제공하는 메서드이다.
    public void checkup() {
        System.out.println("테란 유닛 이름 : " + terran.getName());
        System.out.println("테란 유닛 레벨 : " + terran.getLevel());
        terran.sound();
    }

    public Terran getBigger(Terran target) {
        return terran.getLevel() > target.getLevel() ? terran : target;

    }
}
