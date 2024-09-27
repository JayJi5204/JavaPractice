package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        /*
        m1과 m2는 인스턴스는 다르지만
        둘다 'A'라는 같은 회원 id를 가지고 있다.
        논리적으로 같은 회원으로 보아야 한다.
         */
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); // 인스턴스 참조이므로 변한다.
        System.out.println("m2.hashCode() = " + m2.hashCode()); // 인스턴스 참조이므로 변한다.
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        /*
         m1과 m2의 해시 코드가 서로 다르기 때문에 다른 위치에 각각 저장된다.
         회원 id가 "A"로 같은 회원의 데이터가 중복 저장된다.
         */
        set.add(m1);
        set.add(m2);
        System.out.println(set);

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        // 인스턴스가 서로 달라 m1, m2는 비교에 실패
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
// - 결과값 -
// m1.hashCode() = 495053715
// m2.hashCode() = 666641942
// m1.equals(m2) = false
// MyHashSetV2{buckets=[[], [], [MemberNoHashNoEq{id='A'}], [], [],
// [MemberNoHashNoEq{id='A'}], [], [], [], []], size=2, capacity=10}
// searchValue.hashCode() = 1702297201
// contains = false