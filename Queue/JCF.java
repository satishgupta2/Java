package Queue;
import java.util.*;
import java.util.Stack;


public class JCF {
    // static class Queue {
    
    //     static Stack <Integer> s1=new Stack<>();
    //     static Stack <Integer> s2=new Stack<>();
        
    //     public static boolean isEmpty(){
    //         return s1.isEmpty();
    //     }
        
        
    //     // add 0(n)
    //     public static void add(int data){
    //         while (!s1.isEmpty()) {
    //             s2.push(s1.pop());
    //         }
    //         s1.push(data);
            
    //         while (!s2.isEmpty()) {
    //             s1.push(s2.pop()) ;           
    //         }
    //     }
        
        
    //     //remove
    //     public static int remove(){
    //         if (isEmpty()) {
    //             System.out.println("queue empty");
    //             return -1;
    //         }
    //         return s1.pop();
    //     }
        
    //     //peek
    //     public static int peek(){
    //         if (isEmpty()) {
    //             System.out.println("queue empty");
    //             return -1;
    //         }
    //         return s1.peek();
    //     }
    // }

    public static void printNonRepeating(String str){
        int freq[]=new int [26];
        Queue<Character> q=new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
             q.add(ch);
             freq[ch-'a']++;         
             while (!q.isEmpty() && freq[q.peek()- 'a']>1) {
                q.remove();
                
             }
             if (q.isEmpty()) {
                System.out.print(-1+" ");
             }else{
                System.out.print(q.peek() + " ");
             }
             System.out.println();
        }
    }

    public static void main(String[] args) {
        String str="aabccxb";
        printNonRepeating(str);

//         Queue q=new Queue() ;
//         q.add(1);
//         q.add(2);
//         q.add(3);
        

//         while (!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
    }
}
