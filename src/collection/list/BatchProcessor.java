package collection.list;

public class BatchProcessor {
    private final MyList<Integer> list;

    /*
     생성자를 통해 MyList 구현체 전달
     BatchProcessor의 외부에서 의존관계가 결정되어서
     BatchProcessor 인스턴스에 들어오는 것 같음
     의존관계가 외부에서 주입되는 것 같다 해서
     이것을 의존관계 주입(Dependency Injection)이라 함
     */
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i); // 앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + (endTime - startTime) + "ms");
    }
}
