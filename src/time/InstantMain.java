package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // now() : UTC를 기준, 현재 시간의 Instant를 생성
        Instant now = Instant.now(); //UTC 기준
        System.out.println("now = " + now);

        //from() : 다른 타입의 날짜와 시간을 기준으로 Instant를 생성
        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        //ofEpochSecond() : Epoch 시간을 기준으로 Instant를 생성
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // plusSeconds() : 초를 더한다.
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // getEpochSecond() : 에포크 시간을 기준으로 흐른 초 반환
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
// - 결과값 -
// now = 2024-08-29T06:53:01.889312Z
// from = 2024-08-29T06:53:02.000174500Z
// epochStart = 1970-01-01T00:00:00Z
// later = 1970-01-01T01:00:00Z
// laterEpochSecond = 3600