
package LinkedList;

public  class NewLinkedlist {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }
    public static void main(String[] args) {
        Node head = new Node(1);    
        Node second = new Node(2);
        Node third = new Node(3); 
            head.next = second;
            second.prev = head;
            second.next = third;
            third.prev = second;
            // third.next = head;

            // lentgh of linked list
            Node temp = head.next;
            int count = 1;
            while(temp!=head){
                count++;
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println();
            System.out.println("Length of linked list is: " + count);
    }
    
}