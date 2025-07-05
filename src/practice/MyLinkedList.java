package practice;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    private Node head;

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + ",");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.print();
    }
}
