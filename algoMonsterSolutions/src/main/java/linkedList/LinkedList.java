package linkedList;

public class LinkedList {
    Node head;

    LinkedList (Node head) {
        this.head = head;
    }

    public void append(int data) {
        Node iterator = head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }

        iterator.next.data = data;
    }

    public void printLinkedList () {
        Node iterator = head;
        while (iterator != null) {
            System.out.println(iterator.data);
            iterator = iterator.next;
        }
    }
}
