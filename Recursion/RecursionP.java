package Recursion;

public class RecursionP {

    // Q1.
    public static void  Incides(int arr[], int key,int idx){
        if (idx==arr.length) {
            return;
        }

        if (arr[idx]==key) {
            System.out.print(idx + " ");
        }
        Incides(arr, key, idx+1);
    }
    // Q2. (eg -  2019) convert two zero one nine
    static String digit[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
    public static void printDigits(int num){
        if (num==0) {
            return;
        }

        int lastdigit=num%10;
        printDigits(num/10);
        System.out.print(digit[lastdigit]+ " ");
    }

    // Q3. write a program to find length of a str
    public static int length(String str){
        if (str.length()==0) {
            return 0;
        }
        return length(str.substring(1))+1;
    }



    // Q4.substring
    public static int countSubstrs(String str,int i,int j,int n){
        if (n==1) {
            return 1;
        }
        if (n<=0) {
            return 0;
        }

        int res=countSubstrs(str, i+1, j, n-1)+ countSubstrs(str, i, j-1, n-1)-countSubstrs(str, i+1, j-1, n-2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

// Q5 print steps to move
public  static void towerofHanoi(int n,String src,String helper,String dest){
    if (n==1) {
        System.out.println("transfer disk " + n + " from "+ src+ " to " +dest);
        return;
    }
    towerofHanoi(n-1, src, dest,helper);
    System.out.println(" transfer disk " + n + " from "+ src+ " to " +dest);
    towerofHanoi(n-1, helper, src,dest);
}

    public static void main(String[] args) {
    //    int arr[]={3,2,4,5,6 ,2,7,2,2};
    //     Incides(arr, 2,0);
    // printDigits(1947);
    // String str="abcab";
    // int n=str.length();
    // System.out.println(countSubstrs(str, 0, n-1, n));
    int n=3;
    towerofHanoi(n,"A", "B", "C");

    }
}
