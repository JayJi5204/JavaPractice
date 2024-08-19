package array;

public class Array1 {
    public static void main(String[] args) {
        int[] grades = new int[3]; //배열 생성
        grades[0] = 1;
        grades[1] = 2;
        grades[2] = 3;
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
}
// - 결과값 -
// 1
// 2
// 3