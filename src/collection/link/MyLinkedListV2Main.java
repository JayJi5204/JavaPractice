package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

       // 첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        list.add(0,"d"); //O(1)
        System.out.println(list);

        System.out.println("첫 번째 항목 삭제");
        list.remove(0); //remove First O(1)
        System.out.println(list);

        // 중간 항목에 추가, 삭제
        System.out.println("중간 항목에 추가");
        list.add(1,"e"); // O(n)
        System.out.println(list);

        System.out.println("중간 항목 삭제");
        list.remove(1); //remove O(n)
        System.out.println(list);
    }
}
// - 결과값 -
// MyLinkedListV1{ first = [a->b->c], size = 3}
// 첫 번째 항목에 추가
// MyLinkedListV1{ first = [d->a->b->c], size = 4}
// 첫 번째 항목 삭제
// MyLinkedListV1{ first = [a->b->c], size = 3}
// 중간 항목에 추가
// MyLinkedListV1{ first = [a->e->b->c], size = 4}
// 중간 항목 삭제
// MyLinkedListV1{ first = [a->b->c], size = 3}