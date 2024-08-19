package poly.ex3;

public abstract class AbstractUnit { // 인스턴스 직접 생성 불가
    public abstract void attack(); // 자식이 반드시 오버라이딩 해야함

    public void move(){
        System.out.println("유닛 이동");
    }
}
