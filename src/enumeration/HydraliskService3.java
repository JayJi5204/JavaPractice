package enumeration;

public class HydraliskService3 {
    // 매개변수로 AttackType2 클래스 사용
    public int DamageType(EnumAttackType1 attackType, int damage) {
        int AttackPercent = 0;
        // 값을 비교할 때는 참조값 비교인 '==' 을 사용한다.
        if (attackType==EnumAttackType1.SMALL) {
            AttackPercent = 50;
        } else if (attackType==EnumAttackType1.MIDDLE) {
            AttackPercent = 75;
        } else if (attackType==EnumAttackType1.LARGE) {
            AttackPercent = 100;
        } else {
            System.out.println("데미지 타입 X");
        }
        return damage * AttackPercent / 100;
    }
}
