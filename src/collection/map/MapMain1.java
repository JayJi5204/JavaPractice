package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        // 특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        // 키 목록 조회
        System.out.println("keySet 활용");
        // Map의 키는 중복을 허용하지 않기에 Set을 반환한다.
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        // 키와 값 목록 조회
        System.out.println("entrySet 활용");
        /*
        Entry는 Map 내부에 있는 인터페이스이다.
        Entry는 키 - 값 쌍으로 이루어진 간단한 객체이다.
        Map내부에서 키와 값을 함께 묶어서 저장할 때 사용한다.
         */
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }

        // 값 목록 조회
        System.out.println("values 활용");
        // Map의 값 목록은 중복을 허용하기에 값 모음이라는 Collection으로 반환한다.
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }
    }
}
// - 결과값  -
// {studentB=80, studentA=90, studentD=100, studentC=80}
// result = 100
// keySet 활용
// key = studentB, value = 80
// key = studentA, value = 90
// key = studentD, value = 100
// key = studentC, value = 80
// entrySet 활용
// key = studentB, value = 80
// key = studentA, value = 90
// key = studentD, value = 100
// key = studentC, value = 80
// values 활용
// value = 80
// value = 90
// value = 100
// value = 80