package collection.link;

public class Node {
    // 내부에 저장할 데이터
    Object item;
    // 다음으로 연결할 노드의 참조값 공간
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        // 반복문 안에서 문자를 더하기 때문에
        // StringBuilder가 효율적
        StringBuilder sb = new StringBuilder();
        Node x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
