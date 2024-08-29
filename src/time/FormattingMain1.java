package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        // 포맷팅 : 날짜를 문자로
        LocalDateTime now = LocalDateTime.of(2024, 12, 31, 13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅 : " + formattedDate);

        // 파싱 : 문자를 날짜로
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsedDate = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간 : " + parsedDate);
    }
}
// - 결과값 -
// 날짜와 시간 포맷팅 : 2024-12-31 13:30:59
// 문자열 파싱 날짜와 시간 : 2030-01-01T11:30