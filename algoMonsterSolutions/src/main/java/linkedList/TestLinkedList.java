package linkedList;


import org.junit.jupiter.api.Test;

public class TestLinkedList {

    @Test
    public void testupdateLinkedList(){
        Node head = new Node(1);
        head.next = new Node (2);
        head.next.next = new Node (3);
        head.next.next.next = new Node (4);
        head.next = head.next.next;
        LinkedList linkedList = new LinkedList(head);

        linkedList.printLinkedList();

    }

}
