package enumeration;

public enum EnumAttackType2 {
    // if문 제거 및 타입에 따라 데미지 퍼센트를 가지게 변경
    SMALL(50), MIDDLE(75), LARGE(100);
    // AttackPercent 필드 추가
    private final int AttackPercent;

    // 생성자를 통해 필드에 값 저장
    EnumAttackType2(int attackPercent) {
        AttackPercent = attackPercent;
    }

    // 값 조회를 위한 메서드추가
    public int getAttackPercent() {
        return AttackPercent;
    }
    // 캡슐화
    public int DamageType(int damage) {
        return damage * AttackPercent / 100;
    }
}
