package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        // now() : 현재 시간을 기준으로 생성
        LocalTime nowTime = LocalTime.now();
        System.out.println("현재 시간 = " + nowTime);

        // of(...) : 특정 시간을 기준으로 생성한다.(시, 분, 초, 나노초를 입력할 수 있다.)
        LocalTime ofTime = LocalTime.of(9, 10, 30);
        System.out.println("지정 시간 = " + ofTime);

        //plusSeconds() : 특정 초를 더한다.
        LocalTime ofTimePlus = ofTime.plusSeconds(20);
        System.out.println("지정 시간 + 20초 : " + ofTimePlus);
    }
}
// - 결과값 -
// 현재 시간 = 14:28:52.300338300
// 지정 시간 = 09:10:30
// 지정 시간 + 20초 : 09:10:50