package enumeration;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 ENUM 반환
        EnumAttackType1[] values = EnumAttackType1.values();
        System.out.println("values = " + Arrays.toString(values));
        for (EnumAttackType1 value : values) {
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        //String -> ENUM 변환, 잘못된 문자면 오류 발생
        String input = "MIDDLE";
        EnumAttackType1 middle = EnumAttackType1.valueOf(input);
        System.out.println("middle = " + middle);
    }
}
// - 결과값 -
// values = [SMALL, MIDDLE, LARGE]
// name = SMALL, ordinal = 0
// name = MIDDLE, ordinal = 1
// name = LARGE, ordinal = 2
// middle = MIDDLE