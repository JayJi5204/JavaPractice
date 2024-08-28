package enumeration;

public class HydraDamageMain0 {
    public static void main(String[] args) {
        int damage = 100;

        HydraliskService0 hydraliskService0 = new HydraliskService0();
        int small = hydraliskService0.DamageType("SMALL", damage);
        int middle = hydraliskService0.DamageType("MIDDLE", damage);
        int large = hydraliskService0.DamageType("LARGE", damage);

        System.out.println("SMALL 타입의 히드라 데미지 : " + small);
        System.out.println("MIDDLE 타입의 히드라 데미지 : " + middle);
        System.out.println("LARGE 타입의 히드라 데미지 : " + large);

    }
}
// - 결과값 -
// SMALL 타입의 히드라 데미지 : 50
// MIDDLE 타입의 히드라 데미지 : 75
// LARGE 타입의 히드라 데미지 : 100