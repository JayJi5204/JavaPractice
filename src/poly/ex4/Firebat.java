package poly.ex4;

public class Firebat extends AbstractUnit {
    @Override
    public void attack() {
        System.out.println("Firebat 공격");
    }

    @Override
    public void move() {
        System.out.println("Firebat 이동");
    }
}
