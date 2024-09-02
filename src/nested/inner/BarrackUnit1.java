package nested.inner;

public class BarrackUnit1 {
    private Barrack1 barrack1;

    public BarrackUnit1(Barrack1 barrack1) {
        this.barrack1 = barrack1;
    }

    public void start() {
        System.out.println("유닛 이름 : " + barrack1.getName());
        System.out.println(barrack1.getKill() + " 킬을 하였습니다.");

    }
}
