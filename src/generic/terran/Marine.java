package generic.terran;

public class Marine extends Terran {

    public Marine(String name, int level) {
        super(name, level);
    }

    @Override
    public void sound() {
        System.out.println("마린 출격");
    }
}
