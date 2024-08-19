package poly.ex4;

public class Marine extends AbstractUnit {
    @Override
    public void attack() {
        System.out.println("Marine 공격");
    }

    @Override
    public void move() {
        System.out.println("Marine 이동");
    }
}
