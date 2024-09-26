package collection.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[10];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 8;
        // 데이터의 값을 인덱스로 사용해서 조회
        Integer result = inputArray[searchValue];
        System.out.println(result);
    }
}
// - 결과값 -
// inputArray = [1, 2, null, null, null, 5, null, null, 8, null]
// 8