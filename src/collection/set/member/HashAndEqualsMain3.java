package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        // 중복 등록 안됨
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        /*
        m2는 m1과 같은 해시 코드를 사용하므로 해시 인덱스도 같다.
        equals로 비교하여 같은 데이터가 있으므로 저장에 실패한다.
         */
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        /*
        해시 인덱스 내부의 데이터를 모두 비교한다.
        equals 비교에 성공하므로 참을 반환
         */
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
// - 결과값 -
// m1.hashCode() = 96
// m2.hashCode() = 96
// m1.equals(m2) = true
// MyHashSetV2{buckets=[[], [], [], [], [], [], [Member{id='A'}], [], [], []], size=1, capacity=10}
// searchValue.hashCode() = 96
// contains = true