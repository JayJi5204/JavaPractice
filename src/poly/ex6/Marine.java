package poly.ex6;

public class Marine implements InterfaceUnitA,InterfaceUnitB{

    @Override
    public void move() {
        System.out.println("Marine 이동");
    }

    @Override
    public void stop() {
        System.out.println("Marine 정지");
    }

    @Override
    public void attack() {
        System.out.println("Marine 공격");
    }
}
