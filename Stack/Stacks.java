import java.util.Stack;
import java.util.*;
public class Stacks {
    public static void pushAtBottom(Stack <Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // revrese stack
    public static String revreseStack(String str){
        Stack <Character> s=new Stack<>();
        int idx=0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char ch=s.pop();
            result.append(ch);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="Hello World!";
        System.out.println(revreseStack(str));
        // Stack <Integer> s = new Stack<>();
        // s.push(1);  
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 4);
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

    }
}
