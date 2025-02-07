package String;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringQ {

    // Q1
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()==str1.length()) {
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result=Arrays.equals(str1charArray, str2charArray);

            if(result){
                System.out.println(str1+" and "+str2 +"are anagrams of eachother");
            }else{
                System.out.println(str1+" and "+str2 +"are not anagrams of eachother");
            }
        }
            else{
                System.out.println(str1+" and "+str2 +"are not anagrams of eachother"); 
            }




        // Scanner sc=new Scanner(System.in);
        // String str=sc.nextLine();
        // int count=0;
        // for (int i = 0; i < str.length(); i++) {
        //     char ch=str.charAt(i);
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
        //         count++;
        //     }
        // }
        // System.out.println(count);



        // Q2
        // String str="ShradhaDidi";
        // String str1="ApnaCollege"; 
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        // Q3
        String str="ApnaCollege".replace("e","");
        System.out.println(str);
    }
}
