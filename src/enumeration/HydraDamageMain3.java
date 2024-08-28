package enumeration;

public class HydraDamageMain3 {
    public static void main(String[] args) {
        int damage = 100;

        HydraliskService3 hydraliskService3 = new HydraliskService3();
        int small = hydraliskService3.DamageType(EnumAttackType1.SMALL, damage);
        int middle = hydraliskService3.DamageType(EnumAttackType1.MIDDLE, damage);
        int large = hydraliskService3.DamageType(EnumAttackType1.LARGE, damage);

        System.out.println("SMALL 타입의 히드라 데미지 : " + small);
        System.out.println("MIDDLE 타입의 히드라 데미지 : " + middle);
        System.out.println("LARGE 타입의 히드라 데미지 : " + large);
    }
}
// - 결과값 -
// SMALL 타입의 히드라 데미지 : 50
// MIDDLE 타입의 히드라 데미지 : 75
// LARGE 타입의 히드라 데미지 : 100