public class DemoLinkedList {
    static Node head;
    Node tail;

    public DemoLinkedList() {
        this.head = null;
    }

    public void append(int data) {
    Node newNode = new Node(data);
  if (head == null){
      head =  newNode;
  }
  else{
      Node temp=head;
      while (temp.next!=null && temp.next.data<data){

          temp=temp.next;
      }
      newNode.next=temp.next;
      temp.next=newNode;
  }
}
    public void popLast() {
        if (head == null) {
            return;
        } else {
            Node secondLastNode = head;
            Node lastNode=head.next;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
                secondLastNode=secondLastNode.next;
            }
            secondLastNode.next=null;
        }
    }


    void Display() {
        Node newNode = head;
        while (newNode != null) {
            System.out.println(newNode.data);
            newNode = newNode.next;
        }

    }}




