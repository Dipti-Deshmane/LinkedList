public class DemoLinkedList {
    Node head;
    Node tail;

public void append(int data) {
    Node newNode = new Node(data);
  if (head == null){
      head = tail = newNode;
  }
  else{
      Node temp=head;
      while (temp.next!=null){

          temp=temp.next;
      }
      temp.next=newNode;
  }
}

    void Display() {
        Node newNode = head;
        while (newNode != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }

    }}




