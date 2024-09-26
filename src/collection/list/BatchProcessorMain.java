package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        //MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list=new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(50_000);
    }
}
// - 결과값 -
//MyArrayList의 결과값 : 크기 : 50000, 계산 시간 : 7049ms
//MyLinkedList의 결과값 : 크기 : 50000, 계산 시간 : 13ms