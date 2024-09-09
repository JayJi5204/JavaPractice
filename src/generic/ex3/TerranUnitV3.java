package generic.ex3;

import generic.terran.Terran;

// T를 Terran과 그 자식만 맏을 수 있도록 제한
public class TerranUnitV3<T extends Terran> {
    private T terran;

    public void set(T terran) {
        this.terran = terran;
    }

    public void checkup() {
        //Terran이 제공하는 getName(), getLevel() 기능 사용 가능
        System.out.println("테란 유닛 이름 : " + terran.getName());
        System.out.println("테란 유닛 레벨 : " + terran.getLevel());
        terran.sound();
    }

    public T getBigger(T target) {
        return terran.getLevel() > target.getLevel() ? terran : target;
    }
}
