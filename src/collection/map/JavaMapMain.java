package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        // 입력한 순서를 보장하지 않는다.
        run(new HashMap<>());
        // 키를 기준으로 입력한 순서를 보장한다.
        run(new LinkedHashMap<>());
        // 키 자체 의 데이터 값을 기준으로 정렬한다.
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map) {
        System.out.println("map = " + map.getClass());
        map.put("C", 10);
        map.put("B", 20);
        map.put("A", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.print(key + "=" + map.get(key) + " ");
        }
        System.out.println();
    }
}
// - 결과값 -
// map = class java.util.HashMap
// A=30 1=40 B=20 2=50 C=10
// map = class java.util.LinkedHashMap
// C=10 B=20 A=30 1=40 2=50
// map = class java.util.TreeMap
// 1=40 2=50 A=30 B=20 C=10