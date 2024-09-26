package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        /*
        해시 충돌을 고려해서 배열안에 또 배열이 들어가야 한다.
        그래야 해시 충돌이 발생했을 때 여러 값을 담을 수 있다.
        배열 안에 연결리스트가 들어있고, 연결리스트 안에 데이터가 들어가는 구조
         */
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); // 중복
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains (" + searchValue + ") = " + contains);
    }

    // 데이터 등록
    private static void add(LinkedList<Integer>[] buckets, int value) {
        int hashIndex = hashIndex(value);
        // 해시 인덱스로 배열의 인덱스를 검색
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(n)
        // contains()를 사용해서 중복 여부 확인
        // 같은 데이터가 없으면 데이터 저장
        if (!bucket.contains(value)) { // O(n)
            bucket.add(value);
        }
    }

    // 데이터 검색
    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        // 해시 인덱스로 배열의 인덱스를 검색
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        // 찾는 데이터가 있는지 확인
        return bucket.contains(searchValue); // O(n)

    }

    // 해시 인덱스를 반환
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
// - 결과값 -
// buckets = [[], [1], [2], [], [14], [5], [], [], [8], [99, 9]]
// buckets.contains (9) = true