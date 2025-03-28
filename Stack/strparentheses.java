import java.util.Stack;

public class strparentheses {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // opening brackets
            if (ch == '{' || ch == '(' || ch == '[') {
                s.push(ch);
            } else {
                // looking for closing brackets
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && ch == ')')
                        || (s.peek() == '{' && ch == '}')
                        || (s.peek() == '[' && ch == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();

        for (int i = 0; i < str.length(); i++) { //O(n)
            char ch=str.charAt(i);

            // closing
            if (ch==')') {
                int count=0;
                while (s.pop()!='(') {
                    count++;
                }
                if (count<1) {
                    return true; //duplicate
                }
            }
            else{
                //opening
                s.push(ch);
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        // Valid String
        String str = "((a+b))";   //true
        String str2 = "(a-b)";   //false
        System.out.println(isDuplicate(str)); 
    }
}
