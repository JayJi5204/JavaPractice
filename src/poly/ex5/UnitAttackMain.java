package poly.ex5;

public class UnitAttackMain {
    public static void main(String[] args) {
        //InterfaceUnit unit=new InterfaceUnit(); 인터페이스 생성 불가
        Marine marine = new Marine();
        Firebat firebat = new Firebat();
        Ghost ghost = new Ghost();

        attackUnit(marine);
        attackUnit(firebat);
        attackUnit(ghost);

    }

    //새로운 유닛이 추가되어도 변하지 않는 코드
    private static void attackUnit(InterfaceUnit unit) {
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