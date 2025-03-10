package ArrayList;

import java.util.ArrayList;

public class MostWater {

    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int left=0;
        int right=height.size()-1;
        while(left<right){
            int currentWater = Math.min(height.get(left), height.get(right)) * (right-left);
            maxWater = Math.max(maxWater, currentWater);
            if(height.get(left) < height.get(right)){
                left++;
            }else{
                right--;
            }
            
        }
        return maxWater;
    }


    // Brute Force
    // public static boolean pairSum(ArrayList<Integer> list, int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

// 2 pointer approach
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int left=0;
        int right=list.size()-1;
        while(left<right){
            int sum = list.get(left) + list.get(right);
            if(sum == target){
                return true;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return false;
    }

    public static boolean pairSum2(ArrayList<Integer> list,int target){
        int bp=-1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){ //breaking point
                bp=i;
                break;
            }
        }
        int lp=bp+1;  //smallest 
        int rp=bp;    //largest
        while(lp!=rp){
            int sum=list.get(lp) + list.get(rp);
            if( sum == target){
                return true;
            }else if(sum < target){
                lp=(lp+1)%list.size();
            }else{
                rp=(rp-1+list.size())%list.size();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);      
        list.add(9);
        list.add(10);
        
        int target=150;

        // System.out.println(pairSum(list, target));
        System.out.println(pairSum2(list, target));



    }
}
