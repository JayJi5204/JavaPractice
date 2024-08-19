package poly.ex5;

public class Firebat implements InterfaceUnit{
    @Override
    public void attack() {
        System.out.println("Firebat 공격");
    }

    @Override
    public void move() {
        System.out.println("Firebat 이동");
    }
}
