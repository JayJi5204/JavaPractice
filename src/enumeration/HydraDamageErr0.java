package enumeration;

public class HydraDamageErr0 {
    public static void main(String[] args) {
        int damage = 100;

        HydraliskService0 hydraliskService0 = new HydraliskService0();

        // 존재하지 않는 등급
        int light = hydraliskService0.DamageType("LIGHT", damage);
        System.out.println("LIGHT 타입의 히드라 데미지 : " + light);

        // 오타
        int smalll = hydraliskService0.DamageType("SMALLL", damage);
        System.out.println("SMALLL 타입의 히드라 데미지 : " + smalll);

        // 소문자 입력
        int small2 = hydraliskService0.DamageType("small", damage);
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