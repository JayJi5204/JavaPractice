package poly.Game;

public interface Unit { // 유닛의 역할이고 인터페이스이다.
    // Unit 인터페이스를 사용해서 새로운 유닛을 자유롭게 추가 가능
    // 확장에 열려있다는 의미
    void move();
    void attack();
    void hold();
}
