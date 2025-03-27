import java.util.ArrayList;
import java.util.*;

public class Stack {

    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class StackA {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }

        // pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        // peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }else{
                return head.data;
            }
        }

    }
    static ArrayList<Integer> stack = new ArrayList<>();
        public static boolean isEmpty(){
            return stack.size()==0;
        }

        // push
        public static void push(int data){
            stack.add(data);
        }
        

        // pop
        public static int pop(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top=stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }

        // peek
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return stack.get(stack.size()-1);
        }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        // StackA s = new StackA();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
