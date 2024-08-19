package poly.ex5;

public class Ghost implements InterfaceUnit{
    @Override
    public void attack() {
        System.out.println("Ghost 공격");
    }

    @Override
    public void move() {
        System.out.println("Ghost 이동");
    }
}