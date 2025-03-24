package LinkedList;

public class DoubleLL {

    public class Node {
    int data;
    Node next;
    Node prev;
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data){
        Node newNode=new Node(data);  // create new node
        size++; // increase size
        if (head==null) { // if list is empty
            head=tail=newNode;
            return;
        }
        newNode.next=head; // point next of new node to head
        head.prev=newNode; // point prev of head to new node
        head=newNode; // make new node as head
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    // remove 

    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println("Size: "+size);

    }
}
