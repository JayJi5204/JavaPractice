package enumeration;

public class AttackType2 {
    public static final AttackType2 SMALL = new AttackType2();
    public static final AttackType2 MIDDLE = new AttackType2();
    public static final AttackType2 LARGE = new AttackType2();

    // 기본 생성자를 private로 막아서 외부에서 AttackType2를 생성하지 못하게 한다.
    private AttackType2() {
    }
}
