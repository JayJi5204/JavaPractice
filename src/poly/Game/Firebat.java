package poly.Game;

public class Firebat implements Unit { // 인터페이스 구현

    @Override
    public void move() {
        System.out.println("Firebat.move");
    }

    @Override
    public void attack() {
        System.out.println("Firebat.attack");
    }

    @Override
    public void hold() {
        System.out.println("Firebat.hold");
    }
}
