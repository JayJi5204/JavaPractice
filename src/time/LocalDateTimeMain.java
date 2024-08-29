package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {

        // now() : 현재 날짜와 시간을 기준으로 생성
        LocalDateTime nowDt = LocalDateTime.now();
        System.out.println(nowDt);

        // of(...) : 특정 날짜와 시간을 기준으로 생성
        LocalDateTime ofDt = LocalDateTime.of(1998, 12, 23, 15, 2, 49);
        System.out.println(ofDt);

        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(10);
        System.out.println("지정 날짜시간 + 10일 = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜시간 + 1년 = " + ofDtPlus1Year);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? "+nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? "+nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간과 지정 날짜시간이 같은가? "+nowDt.isEqual(ofDt));
    }
}
// - 결과값 -
// 2024-08-29T14:39:12.259139300
// 1998-12-23T15:02:49
// localDate = 1998-12-23
// localTime = 15:02:49
// localDateTime = 1998-12-23T15:02:49
// 지정 날짜시간 + 10일 = 1999-01-02T15:02:49
// 지정 날짜시간 + 1년 = 1999-12-23T15:02:49
// 현재 날짜시간이 지정 날짜시간보다 이전인가? false
// 현재 날짜시간이 지정 날짜시간보다 이후인가? true
// 현재 날짜시간과 지정 날짜시간이 같은가? false
