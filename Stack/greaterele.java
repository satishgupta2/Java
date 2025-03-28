import java.util.Stack;

// Given an array of integers, find the next greater element for each element in the array.
public class greaterele {
    public static void main(String[] args) { // O(n) time complexity 
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[] =new int [arr.length];

        for(int i=arr.length-1;i>=0;i--){
            // while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            // if-else
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            //3push in stack
            s.push(i) ;  // push the index of the current element
        }
            for(int i=0;i<nxtGreater.length;i++){
                System.out.print(nxtGreater[i]+" ");
            }
            System.out.println();
    }
}
