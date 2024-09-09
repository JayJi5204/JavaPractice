package generic.ex2;

import generic.terran.Tank;
import generic.terran.Marine;
import generic.terran.Terran;

public class TerranMain1 {
    public static void main(String[] args) {
        Terran terran = new Terran("Terran", 0);
        Marine marine = new Marine("Marine", 1);
        Tank tank = new Tank("Tank", 2);

        // Marine 타입을 보관할 수 있다.
        Box<Marine> marineBox = new Box<>();
        marineBox.setValue(marine);
        Marine findMarine = marineBox.getValue();
        System.out.println("FineMarine = " + findMarine);

        // Tank 타입을 보관할 수 있다.
        Box<Tank> tankBox = new Box<>();
        tankBox.setValue(tank);
        Tank findTank = tankBox.getValue();
        System.out.println("FindTank = " + findTank);

        // Terran 타입을 보관할 수 있다.
        Box<Terran> terranBox = new Box<>();
        terranBox.setValue(terran);
        Terran findTerran = terranBox.getValue();
        System.out.println("FindTerran = " + findTerran);
    }
}
// - 결과값 -
// FineMarine = Terran{name='Marine', level=1}
// FindTank = Terran{name='Tank', level=2}
// FindTerran = Terran{name='Terran', level=0}