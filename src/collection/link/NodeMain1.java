package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        // 노드 생성하고 연결하기 : A -> B -> C
        // Node 인스턴스 생성, item에 "A" 입력
        Node first = new Node("A");
        // Node 인스턴스 생성, item에 "B" 입력
        first.next = new Node("B");
        // Node 인스턴스 생성, item에 "C" 입력
        first.next.next = new Node("C");
        System.out.println(first);

        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        // 특정 index의 노드 조회하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "E");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);

    }

    // 다음 노드가 없을 때 까지 반복해서 노드의 데이터 출력
    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
    // 마지막 노드 조회
    // Node.next의 참조값이 null인 노드 반환
    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    // 특정 index의 노드 조회
    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
    // 데이터 추가
    // 마지막 노드를 찾고, 마지막 노드의 next에 새로운 노드 연결
    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }
}
// - 결과값 -
// [A->B->C]
// 모든 노드 탐색하기
// A
// B
// C
// lastNode = [C]
// index2Node = C
// 데이터 추가하기
// [A->B->C->D]
// [A->B->C->D->E]
// [A->B->C->D->E->F]