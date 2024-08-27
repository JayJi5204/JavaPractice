package lang.string.builder;

public class StringBuilderMain1 {
    public static void main(String[] args) {
        // StringBuilder 객체를 생성한다.
        StringBuilder sb = new StringBuilder();

        // 여러 문자열을  추가한다.
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        // 특정 위치에 문자열을 삽입한다.
        sb.insert(4, "Java");
        System.out.println("insert = " + sb);

        // 특정 범위의 문자열을 삭제한다.
        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        // 문자열을 뒤집는다.
        sb.reverse();
        System.out.println("reverse = " + sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = " + string);

    }
}
// - 결과값 -
// sb = ABCD
// insert = ABCDJava
// delete = ABCD
// reverse = DCBA
// string = DCBA
