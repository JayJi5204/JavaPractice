package lang.string;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("Terran");
        String str2 = new String("Terran");
        //new String을 사용해 각각 인스턴스를 생성했기에 서로 다른 인스턴스이므로 false
        System.out.println("new String() == 비교 : " + (str1 == str2));
        //내부에 같은 "Terran" 값을 가지고 있기 때문에 true
        System.out.println("new String() equals 비교 : " + (str1.equals(str2)));

        //문자열 리터럴을 사용하는 경우
        //문자열 풀에서 "Terran"이라는 문자를 가진 String 인스턴스를 찾느다.
        String str3 = "Terran";
        //문자열 리터럴을 사용하므로 문자열 풀에서 str3와 같은 참조를 사용
        String str4 = "Terran";
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
    }
}
// - 결과값 -
// new String() == 비교 : false
// new String() equals 비교 : true
// 리터럴 == 비교 : true
// 리터럴 equals 비교 : true
