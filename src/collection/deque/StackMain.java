package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 스택에 값을 넣는 것을 push라 한다.
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
        System.out.println("stack.peek() = " + stack.peek());

        // 스택 요소 뽑기
        // 스택에서 값을 꺼내는 것을 pop이라 한다.
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println(stack);
    }
}
// - 결과값 -
// [1, 2, 3]
// stack.peek() = 3
// stack.pop() = 3
// stack.pop() = 2
// stack.pop() = 1
// []