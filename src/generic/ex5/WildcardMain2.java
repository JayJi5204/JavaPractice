package generic.ex5;

import generic.terran.Marine;
import generic.terran.Tank;
import generic.terran.Terran;


public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Terran> terranBox = new Box<>();
        Box<Marine> marineBox = new Box<>();
        Box<Tank> tankBox = new Box<>();

        //Terran 포함 상위 타입 전달 가능
        writeBox(objectBox); // 허용
        writeBox(terranBox); // 허용
        //writeBox(marineBox); // 하한이 Terran 불가
        //writeBox(tankBox); // 하한이 Terran 불가

        Terran terran = terranBox.getValue();
        System.out.println("Terran = " + terran);
    }

    static void writeBox(Box<? super Terran> box) {
        box.setValue(new Marine("마린", 1));
    }
}
// - 결과값 -
// Terran = Terran{name='마린', level=1}