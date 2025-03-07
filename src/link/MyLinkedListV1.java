package link;

public class MyLinkedListV1 {
    private Node first; //첫 노드
    private int size=0;   //요소의 갯수

    //맨 뒤에 값 추가
    public void add(Object e) {
        Node newNode = new Node(e); //추가할 값
        //처음 값 추가할 때
        if (first == null) {first = newNode;}
        else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    //마지막 노드 가져올 때
    private Node getLastNode() {
        return getNode(size-1);
    }

    //이전값 출력 후 새 값으로 초기화
    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object old = x.item;
        x.item = e;
        return old;
    }

    //값 가져오기
    public Object get(int index){
        Node node = getNode(index);
        return node.item;
    }

    //노드 가져오기
    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //값으로 인덱스 찾기
    public int indexOf(Object e) {
        int index = 0;
        Node x = first;
        while (x != null) {
            if(e.equals(x.item)) return index;
            index++;
            x = x.next;
        }
        return -1;
    }

    //요소 갯수 출력
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
