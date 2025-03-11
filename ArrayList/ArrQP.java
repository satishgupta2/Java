package ArrayList;

import java.util.ArrayList;

// Q1. An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array A is monotone increasing if for all i <= j, A[i] <= A[j].
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


    // Q2. Given an array of integers nums and an integer key, return the most frequent element in the array.
    // If there is a tie, return the smaller element.
    public static int mostFrequent(ArrayList<Integer> nums, int key){
        int [] result =new int[1000];
        for (int i = 0; i < nums.size()-1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i+1)-1]++;
                
            }
        }
        int max = Integer.MIN_VALUE;
        int ans=0 ;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i+1;
            }
        }
        return ans;
      }
    public static void main(String[] args) {
        // int arr[] = {1,3,2};
        // ArrQP obj = new ArrQP();    
        // System.out.println(obj.isMonotonic(arr));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        System.out.println(mostFrequent(nums, 1));


    }
}
