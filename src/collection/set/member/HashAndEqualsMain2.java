package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        /*
        hashCode()를 재정의했기 때문에
        같은 id를 사용하는 m1, m2는 같은 해시 코드를 사용
        따라서 같은 해시 인덱스에 데이터 저장
         */
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        /*
        equals를 재정의 하지 않았으므로
        인스턴스가 서로 다른 m1, m2는 비교에 실패하고
        중복데이터가 없다고 생각하고 m1, m2를 모두 저장
        결과적으로 같은 회원 id를 가진 중복 데이터가 저장
         */
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        // 인스턴스가 서로 달라 m1, m2는 비교에 실패
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
// - 결과값 -
// m1.hashCode() = 96
// m2.hashCode() = 96
// m1.equals(m2) = false
// MyHashSetV2{buckets=[[], [], [], [], [], [],
// [MemberOnlyHash{id='A'}, MemberOnlyHash{id='A'}], [], [], []], size=2, capacity=10}
// searchValue.hashCode() = 96
// contains = false