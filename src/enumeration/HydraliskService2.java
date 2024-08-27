package enumeration;

public class HydraliskService2 {
    public int AttackType(String type, int damage) {
        int AttackPercent = 0;
        if (type.equals(StringType.SMALL)) {
            AttackPercent = 50;
        } else if (type.equals(StringType.MIDDLE)) {
            AttackPercent = 75;
        } else if (type.equals(StringType.LARGE)) {
            AttackPercent = 100;
        } else {
            System.out.println("데미지 타입 X");
        }
        return damage * AttackPercent / 100;
    }
}
