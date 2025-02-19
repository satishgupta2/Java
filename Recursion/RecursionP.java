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

    public static void main(String[] args) {
    //    int arr[]={3,2,4,5,6 ,2,7,2,2};
    //     Incides(arr, 2,0);
    // printDigits(1947);
    String str="abcd";
    System.out.println(length(str));

    }
}
