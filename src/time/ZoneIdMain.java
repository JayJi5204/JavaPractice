package time;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        // ZoneId.systemDefault() : 시스템이 사용하는 기본 ZoneId를 반환
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        // ZoneId.of() : 타임존을 직접 제공해서 ZoneId를 반환
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}
// - 결과값 -
// ZoneId.systemDefault = Asia/Seoul
// seoulZoneId = Asia/Seoul