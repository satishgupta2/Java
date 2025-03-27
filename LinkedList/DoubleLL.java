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

    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "<->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    // remove -removeLast
    public int removeFirst(){
        if (head==null) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if (size==1) {
            int val=head.data;
            head=tail=null;
            size--;
            return val; // return value
        }

        int val = head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next =curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        DoubleLL dll=new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        dll.reverse();
        dll.print();
        // System.out.println(dll.size);
        // dll.removeFirst();
        // dll.print();
        // System.out.println(dll.size);


    }
}
