package collection.set;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("AB");
        set.add("SET");
        System.out.println(set);

        System.out.println("A.hashCode() = " + "A".hashCode());
        System.out.println("B.hashCode() = " + "B".hashCode());
        System.out.println("AB.hashCode() = " + "AB".hashCode());
        System.out.println("SET.hashCode() = " + "SET".hashCode());

        // 검색
        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
// - 결과값 -
// MyHashSetV2{buckets=[[], [AB], [], [], [], [A], [B, SET], [C], [D], []], size=6}
// A.hashCode() = 65
// B.hashCode() = 66
// AB.hashCode() = 2081
// SET.hashCode() = 81986
// set.contains(SET) = true