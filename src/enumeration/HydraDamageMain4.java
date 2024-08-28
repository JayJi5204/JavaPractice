package enumeration;

public class HydraDamageMain4 {
    public static void main(String[] args) {
        int damage = 100;

        // EnumAttackType2가 스스로 데미지를 계산하기에 Service클래스는 불필요
        //새로운 타입이 추가되더라도 코드의 변경없이 모든 타입 출력
        EnumAttackType2[] enumAttackType2s = EnumAttackType2.values();
        for (EnumAttackType2 enumAttackType2 : enumAttackType2s) {
            printDamage(enumAttackType2, damage);
        }
    }

    //출력 부분 중복 제거
    private static void printDamage(EnumAttackType2 enumAttackType2, int damage) {
        System.out.println(enumAttackType2.name() + " 타입의 히드라 데미지 : " + enumAttackType2.DamageType(damage));
    }
}
// - 결과값 -
// SMALL 타입의 히드라 데미지 : 50
// MIDDLE 타입의 히드라 데미지 : 75
// LARGE 타입의 히드라 데미지 : 100