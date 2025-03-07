package link;

public class NodeMain3 {
    public static void main(String[] args) {
        //노드 생성 후 A > B > C
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        //모든 노드 탐색
        System.out.println("모든 노드 탐색");
        printAll(first);

        //마지막 노드 조회
        System.out.println("마지막 노드 조회");
        System.out.println(getLastNode(first));

        //특정 index노드 조회
        System.out.println("특정 index노드 조회");
        int index =1;
        System.out.println(getNode(first, index).item);

        //데이터 추가
        System.out.println("데이터 추가");
        add(first, "D");
        System.out.println(first);



    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static void add(Node node, String param) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(param);
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }
}
