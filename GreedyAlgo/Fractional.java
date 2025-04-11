package GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional {
    public static void main(String[] args) {
        int val [] = { 60, 100, 120 };
        int wt [] = { 10, 20, 30 };
        int W = 50;

        double ratio [] []= new double[val.length][2];
        // 0th col=>

        for (int i=0;i<val.length;i++){
            ratio[i][0]=i; // index of item
            ratio[i][1]= (double)val[i]/wt[i]; // value/weight ratio
        }
        // sort ratio based on value/weight ratio in descending order
        Arrays.sort(ratio,Comparator.comparingDouble(o ->o[1]));
        // sort in descending order
        int capacity=W;
        int finalVal=0; // final value of knapsack
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0]; // index of item
            if (capacity>=wt[idx]){
                // if capacity is greater than or equal to weight of item
                finalVal+=val[idx]; // add value of item to final value
                capacity-=wt[idx]; // reduce capacity by weight of item
                
            }else{
                finalVal+=(ratio[i][1]*capacity); // add value of fraction of item to final value
                capacity=0; // capacity is now 0
                break; // break the loop
            }
        }
        System.out.println("Maximum value in Knapsack = " + finalVal);


        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        // sort A and B in ascending order

        int minDiff=0;
        for(int i=0;i<A.length;i++){
            // find minimum difference between A[i] and B[i]
            minDiff+=Math.abs(A[i]-B[i]);
        }
        System.out.println("Minimum difference between A and B = " + minDiff);
        
        
    }
}
