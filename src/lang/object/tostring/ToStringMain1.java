package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object=new Object();
        String string =object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접출력
        System.out.println(object);
    }
}
// - 결과값 -
// java.lang.Object@10f87f48
// java.lang.Object@10f87f48