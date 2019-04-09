package dataStructure;


/**
 * Created by tubangwu on 2018/7/17.
 *
 * @author tubangwu
 */
public class NodeStudy {


    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node init() {
        Node head = new Node(4);
        Node l1 = new Node(2);
        Node l2 = new Node(5);
        Node l3 = new Node(3);
        Node l4 = new Node(7);
        Node l5 = new Node(9);
        Node l6 = new Node(0);
        Node l7 = new Node(1);

        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = null;
        return head;
    }


    public static void main(String[] args) {
        Node node = init();
        print(node);

        //采用快速排序
        quickSort(node, null);
        print(node);

    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println();
    }


    public static void quickSort(Node head, Node end) {
        if (head != end) {
            Node node = partion(head, end);
            quickSort(head, node);
            quickSort(node.next, end);
        }
    }

    public static Node partion(Node head, Node end) {
        int key = head.data;
        Node p1 = head;
        Node p2 = head.next;

        //p2 到末尾结束
        while (p2 != end) {
            if (p2.data < key) {
                p1 = p1.next;

                //交换p1 p2
                int temp = p1.data;
                p1.data = p2.data;
                p2.data = temp;

            }
            p2 = p2.next;

        }

        if (p1 != head) {
            int temp = p1.data;
            p1.data = head.data;
            head.data = temp;
        }

        return p1;
    }


}
