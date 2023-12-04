public class DemoLinkedList {
    Node head;
    Node tail;

public void add(int data) {
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}

    void Display() {
        Node newNode = head;
        while (newNode != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }

    }}




