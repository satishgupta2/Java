package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Coins {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,200,500,2000};

        Arrays.sort(coins,Comparator.reverseOrder());

        int countOfCoins=0;
        int amount=590; // amount to be changed
        ArrayList<Integer> ans=new ArrayList<>(); // to store coins used
        for(int i=0;i<coins.length;i++){
            if (coins[i]<=amount){
                while (coins[i]<=amount) {
                    countOfCoins++;
                    ans.add(coins[i]); // add coin to list
                    amount-=coins[i]; // reduce amount by coin value
                }
            }
        }
        System.out.println("Minimum number of coins required: " + countOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" "); // print coins used
        }
        System.out.println();
        
    }
}
