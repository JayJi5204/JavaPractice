package collection.set.javaset;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        // 입력한 순서를 보장하지 않는다.
        run(new HashSet<>());
        // 입력한 순서를 정확히 보장한다.
        run(new LinkedHashSet<>());
        // 데이터 값을 기준으로 정렬한다.
        run(new TreeSet<>());
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) { // 다음 데이터가 있는지 확인
            System.out.print(iterator.next() + " "); // 다음 데이터를 반환
        }
        System.out.println();
    }
}
// - 결과값 -
// set = class java.util.HashSet
// A 1 B 2 C
// set = class java.util.LinkedHashSet
// C B A 1 2
// set = class java.util.TreeSet
// 1 2 A B C
