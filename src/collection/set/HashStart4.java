package collection.set;

import java.util.Arrays;

public class HashStart4 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(99) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray, 1);
        add(inputArray, 2);
        add(inputArray, 5);
        add(inputArray, 8);
        add(inputArray, 14);
        add(inputArray, 99);
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 검색
        int searchValue = 14;
        int hashIndex = hashIndex(searchValue);
        System.out.println("hashIndex() = " + hashIndex);
        Integer result = inputArray[hashIndex]; //O(1)
        System.out.println(result);
    }
    // 해시 인덱스의 위치에 데이터 저장
    private static void add(Integer[] inputArray, int value) {
        // 해시 인덱스를 구하고, 배열에 해시 인덱스를 대입해서 갑을 조회
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }
    // 해시 인덱스를 반환
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
// - 결과값 -
// hashIndex(1) = 1
// hashIndex(2) = 2
// hashIndex(5) = 5
// hashIndex(8) = 8
// hashIndex(14) = 4
// hashIndex(99) = 9
// inputArray = [null, 1, 2, null, 14, 5, null, null, 8, 99]
// hashIndex() = 4
// 14