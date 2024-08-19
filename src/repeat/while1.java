package repeat;

public class while1 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i % 2 == 0) {
                i++;
                if (i % 7 == 0) {
                    break;
                }
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
//결과값 : 10
