package poly.ex5;

public class Marine implements InterfaceUnit {
    @Override
    public void attack() {
        System.out.println("Marine 공격");
    }

    @Override
    public void move() {
        System.out.println("Marine 이동");
    }
}
