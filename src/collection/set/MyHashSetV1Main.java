package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        // 배열의 크기를 10으로 지정
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9); // hashIndex 중복
        System.out.println(set);

        // 검색
        int searchValue = 9;
        boolean searchResult = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + searchResult);

        // 삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}
// - 결과값 -
// MyHashSetV1{buckets=[[], [1], [2], [], [14], [5], [], [], [8], [99, 9]], size=7}
// set.contains(9) = true
// removeResult = true
// MyHashSetV1{buckets=[[], [1], [2], [], [14], [5], [], [], [8], [99]], size=6}