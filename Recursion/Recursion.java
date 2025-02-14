package Recursion;

public class Recursion {

    // Decreasing number
    public static void printDec(int n){
        if (n==1) {
            System.out.println(n);
            return;      
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    // Increasing Number
    public static void printInc(int n){
        if (n==1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    

    // factorial
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fact((n-1));
        return fn;
    }


// sum of natural numbers
    public static int calcsum(int n){
        if (n==1) {
            return 1;
        }
        int sum=calcsum(n-1);
        int sum1=n+sum;
        return sum1;
    }


    //fibonnacci Series
    public static int  fib(int n){
        if (n==0 || n==1) {
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    } 

    // check given aaray is sorted or not
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,2};
        // int n=6;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(calcsum(n));
        // System.out.println(fib(n));
        System.out.println(isSorted(arr,0));
        
    }
}
