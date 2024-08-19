package poly.Game;

public class User { // 유닛의 역할에만 의존한다.
    // 코드를 수정하지 않아도 된다.
    private Unit unit;

    public void setUnit(Unit unit) { // 멤버 변수에 유닛을 설정
        this.unit = unit;
    }

    public void order() { // 인터페이스가 제공하는 기능들을 통해 유닛에 명령을 내린다.
        System.out.println("유닛 명령");
        unit.move();
        unit.attack();
        unit.hold();
    }
}
