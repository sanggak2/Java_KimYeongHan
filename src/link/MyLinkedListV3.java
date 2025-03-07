package link;

public class MyLinkedListV3<E> {
    private Node<E> first; //첫 노드
    private int size=0;   //요소의 갯수

    //맨 뒤에 값 추가
    public void add(E e) {
        Node<E> newNode = new Node<>(e); //추가할 값
        //처음 값 추가할 때
        if (first == null) first = newNode;
        else{
            Node<E> lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    //V2: 특정 index에 값 추가
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if(index==0){
            newNode.next = first;
            first = newNode;
        }
        else{
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    //마지막 노드 가져올 때
    private Node<E> getLastNode() {
        return getNode(size-1);
    }

    //이전값 출력 후 새 값으로 초기화
    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E old = x.item;
        x.item = e;
        return old;
    }

    //V2: 삭제
    public E remove(int index){
        Node<E> removeNode = getNode(index);
        E removeItem = removeNode.item;
        if (index==0) first = removeNode.next;
        else{
            Node<E> prev = getNode(index-1);
            prev.next = removeNode.next;
        }
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removeItem;
    }

    //값 가져오기
    public E get(int index){
        Node<E> node = getNode(index);
        return node.item;
    }

    //노드 가져오기
    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    //값으로 인덱스 찾기
    public int indexOf(E e) {
        int index = 0;
        Node<E> x = first;
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

    private static class Node<E>{
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
        //[A->B->C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this; //A
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if(x.next != null)sb.append("->");
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
