package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Marine marine = new Marine();
        Zergling zergling = new Zergling();

        action(marine);
        action(zergling);
    }

    private static void action(Object object) {
        //object.move(); //컴파일 오류, Object는 move()가 없다.
        //object.attack(); //컴파일 오류, Object는 attack()이 없다.

        //객체에 맞는 다운캐스팅 필요
        if (object instanceof Marine marine) {
            marine.move();
        } else if (object instanceof Zergling zergling) {
            zergling.attack();
        }
    }
}
// - 결과값 -
// Marine 이동
// Zergling 공격