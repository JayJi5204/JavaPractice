package poly.Game;

public class Marine implements Unit{ // 인터페이스 구현

    @Override
    public void move() {
        System.out.println("Marine.move");
    }

    @Override
    public void attack() {
        System.out.println("Marine.attack");
    }

    @Override
    public void hold() {
        System.out.println("Marine.hold");
    }
}
