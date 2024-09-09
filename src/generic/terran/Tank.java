package generic.terran;

public class Tank extends Terran {

    public Tank(String name, int level) {
        super(name, level);
    }

    @Override
    public void sound() {
        System.out.println("탱크 출격");
    }
}
