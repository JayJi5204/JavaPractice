package generic.ex5;

import generic.terran.Terran;

public class WildcardEx {

    // 비제한 와일드카드
    /*
    제네릭 메서드
    Box<Mairine> marineBox를 전달한다.
    타입 추론에 의해 타입 T가 Marine이 된다.
     */
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.getValue());
    }

    /*
    일반적인 메서드
    Box<Mairine> marineBox를 전달한다.
    와일드카드 ?는 모든 타입을 받을 수 있다.
     */
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.getValue());
    }

    // 상한 와일드카드
    /*
     와일드카드에도 마찬가지로 상한 제한을 둘 수 있다.
     Terran과 그 하위 타입만 입력 받음
     Terran 타입의 기능 호출 가능
     */
    static <T extends Terran> void printGenericV2(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Terran> box) {
        Terran terran = box.getValue();
        System.out.println("이름 = " + terran.getName());
    }


    // 타입 매개변수가 꼭 필요한 경우
    static <T extends Terran> T printAndReturnGeneric(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Terran printAndReturnWildcard(Box<? extends Terran> box) {
        Terran terran = box.getValue();
        System.out.println("이름 = " + terran.getName());
        return terran;
    }
}
