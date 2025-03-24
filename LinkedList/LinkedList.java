package LinkedList;


public class LinkedList {
    public static  class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;    
    public static Node tail;
    public static int size;


    // Methods
  
    public void addFirst(int data){
        // step1= Create a new node
        Node newNode = new Node(data);
        size++;
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
        size++;
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


    public void add(int idx,int data){
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++; 
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if (size==0) {
            System.out.println("List is empty");
            return  Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }


    public int removeLast(){
        if (size==0) {
            System.out.println("List is empty");
            return  Integer.MIN_VALUE;
        }else if (size==1) {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // prev will point to head
        Node prev=head;
        for (int i = 0; i < size-2; i++) {
            prev=prev.next;
        }
        prev.next=null;
        int val=tail.data   ;
        tail=prev;
        size--;
        return val;

    }

    public int itrSerach(int key){ //O(n)
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if (temp.data ==key) {
                System.out.println("Element found at index: "+idx);
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        // key not found
        return -1;
    }

    public int recSerachHelper(Node head,int key){
        if (head==null) {
            return -1;
        }
        if(head.data== key){
            return 0;
        }
        int idx=recSerachHelper(head.next, key);
        if (idx==-1) {
            return -1;
        }
        return idx+1;
    }

    public int recSerach(int key){
        return recSerachHelper(head,key);
    }


    public void reverse(){ //O(n)
        Node prev=null; 
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public void deleteNthfromEnd(int n){
        // calculate 
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if (n== sz) {
            head=head.next;
            return;
            
        }

        // sz-n
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }


  
    //slow fast Approach
    public Node findMiNode(Node head){
        Node slow=head;
        Node fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;  //1 step
            fast=fast.next.next;  //2 step
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if (head==null || head.next==null) {
            return true;
            
        }
        //step 1- find mid
        Node mid=findMiNode(head);

        //step2 - reverse second half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;   //right half head
        Node left =head;   //left half head

        //step3 - compare first half and second half
        while(right!=null){
            if (left.data!=right.data) {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

public static boolean iscycle(){
    Node slow=head;
    Node fast=head;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast) {
            return true;
            
        }
    }
    return false;
}


public static void removeCycle(){
    //detect cycle
    Node slow=head;
    Node fast=head;
    boolean isCycle=false;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if (slow==fast) {
            isCycle=true;
            break;
        }
    }

    if (isCycle==false) {
        return;
        
    }


    //find starting point of cycle
    slow=head;
    Node prev=null;
    while (slow!=fast) {
        prev=fast;
        slow=slow.next;
        fast=fast.next;
    }

    //remove cycle
    prev.next=null;
    
}


private Node getMid(Node head){
    if (head==null || head.next==null) {
        return head;
        
    }
    Node slow=head;
    Node fast=head.next;
    while (fast.next!=null && fast.next.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;  //mide node
}

private Node merge(Node head1,Node head2){
    Node mergedLL=new Node (-1);
    Node temp=mergedLL;

    while(head1!=null && head2 !=null){
        if (head1.data<head2.data) {
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }else{
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
    }

    while (head1!=null) {
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
        
    }
    while (head2!=null)  {
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
    }
    return mergedLL.next;
}



// merge two sorted linked list
public Node mergeSort(Node head){
    if (head==null || head.next==null) {
        return head;
        
    }
    // find mid
    Node mid=getMid(head);

    // sort right &  left half
    Node rightHead=mid.next;
    mid.next=null;
   Node newleft= mergeSort(head);
   Node newright= mergeSort(rightHead);

    // merge two sorted linked list
    return merge(newleft,newright);
}


// zig-zag

public void zigZag(){
    //find mid
    Node slow=head;
    Node fast=head.next;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow; 

    //reverse second half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;

    while (curr!=null) {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node right=prev;
    Node left=head;
    Node nextL,nextR;
    //merge two linked list
    while(left!=null && right!=null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;
        left=nextL;
        right=nextR;

    }
}
    public static void main(String[] args) {
        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3); 
        // head.next.next.next=temp  ;
        // // 1-2-3-2
        // System.out.println(iscycle());
        // removeCycle();
        // System.out.println(iscycle());
        // 1-2-3-1
        LinkedList ll = new LinkedList();
       ll.addLast(1);
       ll.addLast(2);
       ll.addLast(3);
       ll.addLast(4);
       ll.addLast(5);
       ll.addLast(6);
    //    1-2-3-4-5
       ll.print();
       ll.zigZag();
    //    ll.head=ll.mergeSort(ll.head);   //O(nlogn)
       ll.print();

    //    ll.addLast(  1);
    //    ll.addLast(  2);
    //    ll.addLast(  2);
    //    ll.addLast(1);
    //    ll.add(2, 3); //12345
        //  ll.print();
        //  System.out.println(ll.checkPalindrome());
        //  ll.reverse();
        //  ll.deleteNthfromEnd(3);
            // ll.print();
        // System.out.println(ll.recSerach(4));
        // System.out.println(ll.recSerach(10));

        //  ll.removeFirst();
        //  System.out.println("After removing first element");
            // ll.print();
            // ll.removeLast();
            // System.out.println("After removing last element");
            // ll.print();
        //  System.out.println("Size of linked list is: "+size);
    }
}
