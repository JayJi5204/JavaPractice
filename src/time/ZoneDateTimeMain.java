package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {
    public static void main(String[] args) {

        // now() : 현재 날짜와 시간을 기준으로 생성
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        // of(...) : 특정 날짜와 시간을 기준으로 생성
        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 10, 20, 30);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 =  " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1, 10, 20, 30, 0, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        // withZoneSameInstant(ZoneId) : 타임존 변경
        ZonedDateTime utxZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utxZdt);

    }
}
// - 결과값 -
// nowZdt = 2024-08-29T15:06:06.145561400+09:00[Asia/Seoul]
// zdt1 =  2030-01-01T10:20:30+09:00[Asia/Seoul]
// zdt2 = 2030-01-01T10:20:30+09:00[Asia/Seoul]
// utcZdt = 2030-01-01T01:20:30Z[UTC]