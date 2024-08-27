package enumeration;

public class HydraDamageErr2 {
    public static void main(String[] args) {
        int damage = 100;

        // String 타입은 어떤 문자열이든 입력할 수 있어서 근본적 문제 해결 불가
        HydraliskService2 hydraliskService2 = new HydraliskService2();

        // 존재하지 않는 등급
        int light = hydraliskService2.AttackType("LIGHT", damage);
        System.out.println("LIGHT 타입의 히드라 데미지 : " + light);

        // 오타
        int smalll = hydraliskService2.AttackType("SMALLL", damage);
        System.out.println("SMALLL 타입의 히드라 데미지 : " + smalll);

        // 소문자 입력
        int small2 = hydraliskService2.AttackType("small", damage);
        System.out.println("small 타입의 히드라 데미지 : " + small2);

    }
}
// - 결과값 -
// 데미지 타입 X
// LIGHT 타입의 히드라 데미지 : 0
// 데미지 타입 X
// SMALLL 타입의 히드라 데미지 : 0
// 데미지 타입 X
// small 타입의 히드라 데미지 : 0