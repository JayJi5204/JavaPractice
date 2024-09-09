package generic.terran;

public class Terran {

    private final String name;
    private final int level;

    public Terran(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void sound() {
        System.out.println("유닛 대사");
    }

    @Override
    public String toString() {
        return "Terran{" + "name='" + name + '\'' + ", level=" + level + '}';
    }
}
