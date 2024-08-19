package poly.Game;

public class Ghost implements Unit { // 인터페이스 구현

    @Override
    public void move() {
        System.out.println("Ghost.move");
    }

    @Override
    public void attack() {
        System.out.println("Ghost.attack");
    }

    @Override
    public void hold() {
        System.out.println("Ghost.hold");
    }
}
