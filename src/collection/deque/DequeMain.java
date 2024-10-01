package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        //  데이터 추가
        deque.offerFirst(1); // 앞에 추가한다.
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3); // 뒤에 추가한다.
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        // 다음 꺼낼 데이터 확인(꺼내지 안혹 단순 조회만)
        System.out.println("deque.peekFirst() = " + deque.peekFirst());
        System.out.println("deque.peekLast() = " + deque.peekLast());

        // 데이터 꺼내기
        System.out.println("deque.pollFirst() = " + deque.pollFirst()); // 앞에서 꺼낸다
        System.out.println("deque.pollFirst() = " + deque.pollFirst());
        System.out.println("deque.pollLast() = " + deque.pollLast()); // 뒤에서 꺼낸다
        System.out.println("deque.pollLast() = " + deque.pollLast());
        System.out.println(deque);
    }
}
// - 결과값 -
// [1]
// [2, 1]
// [2, 1, 3]
// [2, 1, 3, 4]
// deque.peekFirst() = 2
// deque.peekLast() = 4
// deque.pollFirst() = 2
// deque.pollFirst() = 1
// deque.pollLast() = 4
// deque.pollLast() = 3
// []