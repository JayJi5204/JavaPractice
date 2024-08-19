package condition;

public class Switch1 {
    public static void main(String[] args) {
        int score = 90; //점수
        switch (score) {
            case 100:
                System.out.println("S");
                break;
            case 90:
                System.out.println("A");
                break;
            case 80:
                System.out.println("B");
                break;
            case 70:
                System.out.println("C");
                break;
            case 60:
                System.out.println("F");
                break;
        }
    }
}
//결과값 : A