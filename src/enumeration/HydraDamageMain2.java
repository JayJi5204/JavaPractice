package enumeration;

public class HydraDamageMain2 {
    public static void main(String[] args) {
        int damage = 100;

        HydraliskService2 hydraliskService2 = new HydraliskService2();
        // AttackType2 newAttackType2=new AttackType2(); 생성불가
        int small = hydraliskService2.DamageType(AttackType2.SMALL, damage);
        int middle = hydraliskService2.DamageType(AttackType2.MIDDLE, damage);
        int large = hydraliskService2.DamageType(AttackType2.LARGE, damage);

        System.out.println("SMALL 타입의 히드라 데미지 : " + small);
        System.out.println("MIDDLE 타입의 히드라 데미지 : " + middle);
        System.out.println("LARGE 타입의 히드라 데미지 : " + large);
    }
}
// - 결과값 -
// SMALL 타입의 히드라 데미지 : 50
// MIDDLE 타입의 히드라 데미지 : 75
// LARGE 타입의 히드라 데미지 : 100