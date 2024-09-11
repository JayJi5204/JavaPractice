package generic.ex4;

import generic.terran.Terran;

public class TerranMethod {

    // Terran을 상한으로 제한
    public static <T extends Terran> void checkup(T t) {
        System.out.println("테란 유닛 이름 : " + t.getName());
        System.out.println("테란 유닛 레벨 : " + t.getLevel());
        t.sound();
    }

    public static <T extends Terran> T getBigger(T t1, T t2) {
        return t1.getLevel() > t2.getLevel() ? t1 : t2;
    }
}
