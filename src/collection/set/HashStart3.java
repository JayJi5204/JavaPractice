package collection.set;

import java.util.Arrays;

public class HashStart3 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray = " + Arrays.toString(inputArray));

        int searchValue = 99;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println(result);
    }
}
// - 결과값 -
// inputArray = [1, 2, null, null, null, 5, null, null, 8,
// null, null, null, null, null, 14, null, null, null, null,
// null, null, null, null, null, null, null, null, null,null,
// null, null, null, null, null, null, null, null, null, null,
// null, null, null, null, null, null, null, null, null, null,
// null, null, null, null, null, null, null, null, null, null,
// null, null, null, null, null, null, null, null, null, null,
// null, null, null, null, null, null, null, null, null, null,
// null, null, null, null, null, null, null, null, null, null,
// null, null, null, null, null, null, null, null, null, null, 99]
// 99