package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        // now() : 현재 시간을 기준으로 생성한다.
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 = " + nowDate);

        // of(...) : 특정 날짜를 기준으로 생성한다.(년, 월, 일을 입력할 수 있다.)
        LocalDate ofDate = LocalDate.of(1996, 2, 20);
        System.out.println("지정 날짜 = " + ofDate);

        // plusDays() : 특정 일을 더한다.
        LocalDate plusDays = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10일 = " + plusDays);

    }
}
// - 결과값 -
// 오늘 날짜 = 2024-08-29
// 지정 날짜 = 1996-02-20
// 지정 날짜 + 10일 = 1996-03-01
