package lang.string;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str1 = "Terran";
        String str2 = str1.concat(" Marine");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
// - 결과값 -
// str1 = Terran
// str2 = Terran Marine
