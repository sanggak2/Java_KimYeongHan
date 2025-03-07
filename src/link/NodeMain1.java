package link;

public class NodeMain1 {
    public static void main(String[] args) {
        //노드 생성 후 A > B > C
        Node A = new Node("A");
        A.next = new Node("B");
        A.next.next = new Node("C");

        System.out.println("모든 노드 탐색");
        Node x = A;
        while(x != null){
            System.out.println(x.item);
            x = x.next;
        }
    }
}
