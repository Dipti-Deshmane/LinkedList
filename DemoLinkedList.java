public class DemoLinkedList {
    Node head;
    Node tail;
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail=newNode;
            }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    void Display(){
       Node newNode = head ;
        while (newNode!=null){
            System.out.println(newNode.data);
            newNode =newNode.next;
        }

    }
    }
