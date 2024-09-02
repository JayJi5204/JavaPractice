package nested.inner;

public class Barrack1 {

    private String name;
    private int kill;
    private BarrackUnit1 barrackUnit1;

    public Barrack1(String name, int kill) {
        this.name = name;
        this.kill = kill;
        this.barrackUnit1 = new BarrackUnit1(this);
    }

    // Marine에서만 사용하는 메서드
    public String getName() {
        return name;
    }

    // Marine에서만 사용하는 메서드
    public int getKill() {
        return kill;
    }

    public void start() {
        barrackUnit1.start();
        System.out.printf(name + " 정보 조회 완료");
    }
}
