package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class ArrayP {
    // public static boolean leasttwice(int nums[]){
    //     for (int i = 0; i < nums.length-1; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             if(nums[i]==nums[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // public static int Search(int nums[],int traget){
    //     int min =minSearch(nums);
    //     // find ins sortted left
    //     if(nums[min]<= traget && traget <=nums[nums.length-1]){
    //         return search(nums,min,nums.length-1,traget);
    //     }
    //     // find in sorted right
    //     else{9
    //         return search(nums,0,min,traget);
    //     }
    // }

    // binary search to find target in left to right boundary
    // public static int search(int nums[],int left,int right,int target){
    //     int l=left;
    //     int r=right;
    //     while (1<=r) {
    //         int mid=l+(r+1)/2;
    //         if(nums[mid]==target){
    //             return mid;

    //         }if(nums[mid]>target){

    //             r=mid-1;
    //         }else{
    //             l=mid+1;
    //         }
    //     }
    //     return -1;
    // } 


    // smallest element index
    // public static int minSearch(int nums[]){
    //     int left=0;
    //     int right=nums.length-1;
    //     while (left<right) {
    //         int mid=left +(right-left)/2;
    //         if(mid >0 && nums[mid-1] > nums[mid]){
    //             return mid;
    //         }
    //         else if (nums[left]<=nums[mid] && nums[mid] > nums[right]) {
    //             left=mid+1;
    //         }
    //         else{
    //             right=mid-1;
    //         }
    //     }
    //     return left;
    // }


    // Q3
    public static int maxProfit(int prices[]){
        int buyprice=prices[0];
        int maxProfit=0;

        for (int i = 1; i < prices.length; i++) {
            if(buyprice <prices[i]){
                maxProfit=Math.max(prices[i]-buyprice,maxProfit);
            }else{
                // return 0;
                // buyprice=prices[i];
            }
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
       int prices[]={7,1,5,3,6,4};
       System.out.println(maxProfit(prices));
        // int nums[]={1};
        // int traget=0;
        // System.out.println(Search(nums, traget));
    }
}
