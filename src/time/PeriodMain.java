package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {

        // of() : 특정 기간을 지정해서 Period를 생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        // 계산에 사용
        LocalDate currentDate = LocalDate.of(2030, 1, 1);
        System.out.println("현재 날짜 : " + currentDate);

        LocalDate plusDate = currentDate.plus(period);
        System.out.println("더한 날짜 : " + plusDate);

        //기간 ㅊ아ㅣ
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("기간 : " + between.getMonths() + "개월 " + between.getDays() + "일");
    }
}
// - 결과값 -
// period = P10D
// 현재 날짜 : 2030-01-01
// 더한 날짜 : 2030-01-11
// 기간 : 3개월 1일