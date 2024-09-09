package generic.ex3;

public class TerranUnitV2<T> {
    private T terran;

    public void set(T terran) {
        this.terran = terran;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다.
        // Object의 기능만 사용 가능
        terran.toString();
        terran.equals(null);

        // 컴파일 오류
        //System.out.println("테란 유닛 이름 : " + terran.getName());
        //System.out.println("테란 유닛 레벨 : " + terran.getLevel());
        //terran.sound();
    }

    public T getBigger(T target) {
        // 컴파일 오류
        //return terran.getLevel() > target.getLevel() ? terran : target;
        return null;
    }
}
