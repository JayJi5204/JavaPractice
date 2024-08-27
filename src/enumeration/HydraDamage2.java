package enumeration;

public class HydraDamage2 {
    public static void main(String[] args) {
        int damage = 100;

        HydraliskService2 hydraliskService2 = new HydraliskService2();
        // 실수로 상수의 이름을 잘못입력하면 컴파일 시점에 오류 발생
        int small = hydraliskService2.AttackType(StringType.SMALL, damage);
        int middle = hydraliskService2.AttackType(StringType.MIDDLE, damage);
        int large = hydraliskService2.AttackType(StringType.LARGE, damage);

        System.out.println("SMALL 타입의 히드라 데미지 : " + small);
        System.out.println("MIDDLE 타입의 히드라 데미지 : " + middle);
        System.out.println("LARGE 타입의 히드라 데미지 : " + large);


    }
}
// - 결과값 -
// SMALL 타입의 히드라 데미지 : 50
// MIDDLE 타입의 히드라 데미지 : 75
// LARGE 타입의 히드라 데미지 : 100미지 : 0