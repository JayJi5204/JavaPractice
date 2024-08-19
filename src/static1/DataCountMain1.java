package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        Data2 data1 = new Data2();
        System.out.println(Data2.count);
        Data2 data2 = new Data2();
        System.out.println(Data2.count);
        Data2 data3 = new Data2();
        System.out.println(Data2.count);
        // static 변수는 인스턴스 영역이 아니라 메서드 영역에서 관리한다.
        // 메서드 영역에 있는 count의 값이 하나 증가하게 된다.
    }
}
// - 결과값 -
// 1
// 2
// 3
