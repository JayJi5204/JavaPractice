package poly.Game;

public class UnitMain1 {
    public static void main(String[] args) {
        User user = new User();

        //유닛 선택(Marine)
        Unit Marine = new Marine();
        user.setUnit(Marine);
        user.order();

        //유닛 변경(Firebat)
        Unit Firebat = new Firebat();
        user.setUnit(Firebat);
        user.order();
    }
}
// - 결과값 -
// 유닛 행동
// Marine.move
// Marine.attack
// Marine.hold
// 유닛 행동
// Firebat.move
// Firebat.attack
// Firebat.hold
