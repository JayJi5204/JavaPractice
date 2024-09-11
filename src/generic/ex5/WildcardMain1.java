package generic.ex5;

import generic.terran.Marine;
import generic.terran.Tank;
import generic.terran.Terran;


public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Marine> marineBox = new Box<>();
        Box<Tank> tankBox = new Box<>();
        marineBox.setValue(new Marine("마린", 1));


        WildcardEx.printGenericV1(marineBox);
        WildcardEx.printWildcardV1(marineBox);

        WildcardEx.printGenericV2(marineBox);
        WildcardEx.printWildcardV2(marineBox);

        // 전달한 타입을 명확하게 반환할 수 있다.
        Marine marine = WildcardEx.printAndReturnGeneric(marineBox);
        // 전달한 타입을 명확하게 반환할 수 없다.
        Terran terran = WildcardEx.printAndReturnGeneric(marineBox);
    }
}
// - 결과값 -
// T = Terran{name='마린', level=1}
// ? = Terran{name='마린', level=1}
// 이름 = 마린
// 이름 = 마린
// 이름 = 마린
// 이름 = 마린