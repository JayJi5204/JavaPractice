package nested.inner;

public class Barrack2 {
    private String name;
    private int kill;
    private BarrackUnit2 barrackUnit2;

    public Barrack2(String name, int kill) {
        this.name = name;
        this.kill = kill;
        this.barrackUnit2 = new BarrackUnit2();
    }

    public void start() {
        barrackUnit2.start();
        System.out.printf(name + " 정보 조회 완료");
    }

    // 배럭 유닛을 내부 클래스로 만듬
    private class BarrackUnit2 {
        public void start() {
            System.out.println("유닛 이름 : " + name);
            System.out.println(kill + " 킬을 하였습니다.");
        }
    }
}
