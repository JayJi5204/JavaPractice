package staref;

public class InitMain {
    public static void main(String[] args) {
        InitData3 initData1 = null;
        initData1.value = 10; //initData1 참조형 변수에는 null이 들어가있다.
        //참조할 인스턴스가 존재하지않아 NullPointerException 발생한다.
        System.out.println(initData1.value);
    }
}
// - 결과값 -
//Exception in thread "main" java.lang.NullPointerException:
// Cannot assign field "value" because "initData1" is null
//	at staref.InitMain.main(InitMain.java:6)