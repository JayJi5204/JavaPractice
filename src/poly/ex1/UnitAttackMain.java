package poly.ex1;

public class UnitAttackMain {
    public static void main(String[] args) {
        Marine marine = new Marine();
        Firebat firebat = new Firebat();
        Ghost ghost = new Ghost();

        System.out.println("유닛 공격 테스트 시작");
        marine.attack();
        System.out.println("유닛 공격 테스트 종료");

        System.out.println("유닛 공격 테스트 시작");
        firebat.attack();
        System.out.println("유닛 공격 테스트 종료");

        System.out.println("유닛 공격 테스트 시작");
        ghost.attack();
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