package LinkedList;


public class LinkedList {
    public  class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;    
    public static Node tail;

    // Methods
  
    public void addFirst(int data){
        // step1= Create a new node
        Node newNode = new Node(data);
        if (head==null) {
            head = tail= newNode;
            return;
            
        }
    
        // step2= newNode next will point to head
        newNode.next = head;//linking

        // step3= head will point to newNode
        head = newNode;

    }

    public void addLast(int data){
        // step1= Create a new node
        Node newNode=new Node(data);
        if (head==null) {
            head=tail=newNode;
            return;
        }

        // step2= tail next will point to newNode
        tail.next=newNode;

        // step3= tail will point to newNode
        tail=newNode;
    }

    public void print(){
        if (head==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+"--> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
