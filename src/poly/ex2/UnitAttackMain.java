package poly.ex2;

public class UnitAttackMain {
    public static void main(String[] args) {
        //배열 사용
        Unit[] unitArr = {new Marine(), new Firebat(), new Ghost()};
        for (Unit unit : unitArr) {
            attackUnit(unit);
        }
    }

    //새로운 유닛이 추가되어도 변하지 않는 코드
    private static void attackUnit(Unit unit) {
        System.out.println("유닛 공격 테스트 시작");
        unit.attack();
        System.out.println("유닛 공격 테스트 종료");
    }
}
// - 결과값 -
// 유닛 공격 테스트 시작
// Marine 공격
// 유닛 공격 테스트 종료
// 유닛 공격 테스트 시작
// Firebat 공격
// 유닛 공격 테스트 종료
// 유닛 공격 테스트 시작
// Ghost 공격
// 유닛 공격 테스트 종료