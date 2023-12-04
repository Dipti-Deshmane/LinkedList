
public class Main {
    public static void main(String[] args) {
        DemoLinkedList Demo = new DemoLinkedList();
        Demo.append(56);
        Demo.append(70);



        Node temp = DemoLinkedList.head;
        while (temp.data != 56) {
            temp = temp.next;
        }
        Node newNode = new Node(30);
        newNode.next = temp.next;
        temp.next = newNode;
        Demo.Display();
    }
}