package enumeration;

public class HydraliskService1 {
    public int DamageType(String type, int damage) {
        int AttackPercent = 0;
        if (type.equals(AttackType1.SMALL)) {
            AttackPercent = 50;
        } else if (type.equals(AttackType1.MIDDLE)) {
            AttackPercent = 75;
        } else if (type.equals(AttackType1.LARGE)) {
            AttackPercent = 100;
        } else {
            System.out.println("데미지 타입 X");
        }
        return damage * AttackPercent / 100;
    }
}
