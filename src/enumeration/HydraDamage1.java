package enumeration;

public class HydraDamage1 {
    public static void main(String[] args) {
        int damage = 100;

        HydraliskService1 hydraliskService1 = new HydraliskService1();
        int small = hydraliskService1.AttackType("SMALL", damage);
        int middle = hydraliskService1.AttackType("MIDDLE", damage);
        int large = hydraliskService1.AttackType("LARGE", damage);

        System.out.println("SMALL 타입의 히드라 데미지 : " + small);
        System.out.println("MIDDLE 타입의 히드라 데미지 : " + middle);
        System.out.println("LARGE 타입의 히드라 데미지 : " + large);

    }
}
// - 결과값 -
// SMALL 타입의 히드라 데미지 : 50
// MIDDLE 타입의 히드라 데미지 : 75
// LARGE 타입의 히드라 데미지 : 100