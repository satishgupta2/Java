package String;

import java.util.Scanner;

public class StringP {
    // public static void printletters(String str){
    //     for (int i = 0; i < str.length(); i++) {
    //         System.out.print(str.charAt(i)+ " ");
    //     }
    //     System.out.println();
    // }
    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }


    public static float getshortestPath(String path){
        int x=0,y=0;
        for (int i = 0; i <path.length(); i++) {
            char dir=path.charAt(i);
            // south
            if(dir=='S'){
                y--;
            }
            // north
            else if (dir=='N') {
                y++;
            } 
            // west
            else if(dir == 'W') {
                x--;
            }
            // east
            else{
                x++;
            }
        }
       int  x2=x*x;
       int  y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i <str.length(); i++) {
            if(str.charAt(i)== ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++; 
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str){
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            if(count>1){
                newStr+=count.toString();
            }
        }
        return newStr;
    }

    public static void main(String[] args) {


        String str="aaabbcccdd";
        System.out.println(compress(str));
        // System.out.println(toUpperCase(str));


        // StringBuilder sb=new StringBuilder("");
        // for (char ch='a';ch<='z'; ch++) {
        //     sb.append(ch);
        // }
        // System.out.println(sb);
        // String fruits[]={"apple","mango","banana"};

        // String largest=fruits[0];
        // for (int i = 0; i < fruits.length; i++) {
        //     if( largest.compareTo(fruits[i])<0){
        //         largest=fruits[i];
        //     }
        // }
        // System.out.println(largest.toUpperCase());

        // String sl="Satish";
        // String s2= "Satish";
        // String s3=new String("Satish");


        // String fell =sl.substring(0,2);
        // System.out.println(fell);

        // if(sl.equals(s3)){
        //     System.out.println("is that equal");
        // }else{
        //     System.out.println("not equal");
        // }



        // String path="WNEENESENNN";
        // System.out.println(getshortestPath(path));

        // strings are immutble
        // Scanner sc=new Scanner(System.in);
        // String name;
        // name=sc.nextLine();
        // System.out.println(name);

        // String fullName="Satish Gupta";
        // System.out.println(fullName.length());

        // String firstName="Satish";
        // String lastName="Gupta";
        // String fullName=firstName+" " +lastName;
        // System.out.println(fullName.charAt(0));

        // printletters(fullName);

        // String str="sam";
        // System.out.println(isPalindrome(str));

    }

}
