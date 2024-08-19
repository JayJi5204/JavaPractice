package poly.ex4;

public class Ghost extends AbstractUnit {
    @Override
    public void attack() {
        System.out.println("Ghost 공격");
    }

    @Override
    public void move() {
        System.out.println("Ghost 이동");
    }
}