package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class GreedyAlg {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int activities [][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i; // activity number
            activities[i][1]=start[i]; // start time
            activities[i][2]=end[i]; // end time
        }
        // sort activities based on end time
        Arrays.sort(activities, (a, b) -> Integer.compare(a[2], b[2]));

        // end time basis sorting
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        //1st activity always selected
        maxAct=1;
        ans.add(activities[0][0]);
        // last selected activity end time
        int lastEnd=activities[0][2];
        // iterate through the activities

        for (int i=1;i<end.length;i++){
            // if start time of current activity is greater than or equal to end time of last selected activity
            if (activities[i][1]>=lastEnd){
                // select current activity
                ans.add(activities[i][0]);
                maxAct++;
                // update lastEnd to end time of current activity
                lastEnd=activities[i][2];
            }
        }

        System.out.println("Maximum number of activities: "+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A" +ans.get(i)+" ");
        }
        System.out.println();
    }
}
