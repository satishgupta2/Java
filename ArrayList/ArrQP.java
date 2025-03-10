package ArrayList;

public class ArrQP {
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for(int i=0; i<A.length-1; i++){
            if(A[i] > A[i+1]){ 
                increasing = false;
            }
            if(A[i] < A[i+1]){
                decreasing = false;
            }
        }
        return increasing || decreasing;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2};
        ArrQP obj = new ArrQP();    
        System.out.println(obj.isMonotonic(arr));
    }
}
