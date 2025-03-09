package list;

//DI : 의존성 주입
    //생성자 등을 이용해서 밖에서 new객체를 넘겨주는것
    //이러면 코드를 안바꾸고도 ArrayList -> LinkedList로 바꿀 수 있다.
public class BatchProcessor {
    private final MyList<Integer> list;

    //MyList = new MyArrayList / MyList = new MyLinkedList
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }

    public void addFirst(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 / 크기: "+size+", 계산 시간: "+(endTime-startTime)+"ms");
    }

    public void addMid(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("평균 추가 / 크기: "+size+", 계산 시간: "+(endTime-startTime)+"ms");
    }

    public void addLast(int size){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 / 크기: "+size+", 계산 시간: "+(endTime-startTime)+"ms");
    }

    //이런식으로 나중에 객체를 사용할 수 있다.
//    main(){
//        new BatchProcessor(new MyArrayList());
//        new BatchProcessor(new MyLinkedList());
//    }
}
