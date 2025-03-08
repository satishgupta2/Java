package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class AArList {

    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        
        list1.add(2);
        list1.add(5);
        list1.add(9);
        list1.add(6);
        list1.add(8);
        
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> mainlist2 = new ArrayList<>();
        mainlist2.add(1);
        mainlist2.add(2);
        mainlist.add(mainlist2);

        ArrayList<Integer> mainlist3 = new ArrayList<>();   
        mainlist3.add(3);
        mainlist3.add(4);
        mainlist.add(mainlist3); 

        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> currlist = mainlist.get(i);
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainlist);


        // Collections.sort(list1);
        // System.out.println(list1);

        // Collections.sort(list1, Collections.reverseOrder());
        // System.out.println(list1);
        // int idx1=1, idx2=3;
        // System.out.println(list1);
        // swap(list1, idx1, idx2);

        // System.out.println(list1);



        // int max=Integer.MIN_VALUE;
        // for (int i = 0; i < list1.size(); i++) {
        //     // if (max <list1.get(i)) {
        //     //     max=list1.get(i);
        //     // }

        //     max=Math.max(max, list1.get(i));
        // }
        // System.out.println("max element=" +max);


        // list1.add(1,10);

        // System.out.println(list1);


        // // get op
        // System.out.println(list1.get(2));

    // remove op
        // list1.remove(2);
        // System.out.println(list1);

        // set op
        // list1.set(2, 10);
        // System.out.println(list1);
        
        // System.out.println(list1.contains(4));
        // System.out.println(list1.contains(6));
        // System.out.println(list1.size());

    }
}
