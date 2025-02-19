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


    // first Occurence of a element
    public static int FirstOcc(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOcc(arr,key,i+1);
    }


    // last Occurence
    public static int lastOcc(int arr[],int key,int i){
        if (i==arr.length) {
            return -1;
        }
        int isFound=lastOcc(arr, key, i+1);
        if(isFound ==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }


    //power 
    public static int power(int x,int n){
        if (n==0) {
            return 1;
        }
        return x * power(x, n-1);
    }


    // power 0(log n)
    public static int optimizedpower(int a, int n){ // 0(logn)
        if (n==0) {
            return 1;
        }
        int halfPower=optimizedpower(a, n/2);
        int halfPowerSq=halfPower * halfPower;

        // n is odd
        if(n % 2 !=0){
            halfPowerSq=a*halfPowerSq;
        }
        return halfPowerSq;
    }

    // tilling problem
    public static int tillingProblem(int n){  //2 x n (floor size)
        // base class
        if(n==0 || n==1){
            return 1;
        }

        // kaam
        // vertical choice
         int fnm1=tillingProblem(n-1);

        //  horizontal choice 
        int fnm2=tillingProblem(n-2);

        int totalways=fnm1+fnm2;
        return totalways;
        
    }

    // removeDuplicates
    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        // base
        if (idx== str.length()) {
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar=str.charAt(idx);
        if(map[currChar-'a'] ==true){
            // duplicate
            removeDuplicates(str, idx+1, newStr, map);
        }else{
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }


        // friends Paring p
        public static int friendsPairing(int n){

            // base case
            if (n==1 || n==2) {
                return n;
            }
            return friendsPairing(n-1)+(n-1)* friendsPairing(n-2);

        }


        // Binary Strings
        public static void printBinaryString(int n, int lastPlace, String str){
            // base case
            if (n==0) {
                System.out.println(str);
                return;
            }
            // kaam
            printBinaryString(n-1, 0, str+"0");
            if (lastPlace ==0) {
                printBinaryString(n-1, 1, str+"1");
            }
        }
       public static void main(String[] args) {

        // int a=2;
        // int n=5;
        // int arr[]={1,3,4,5,2,5};
        // int n=6;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(calcsum(n));
        // System.out.println(fib(n));
        // System.out.println(isSorted(arr,0));
        // System.out.println(FirstOcc(arr,5,0));
        // System.out.println(lastOcc(arr,5,0));
        // System.out.println(power(4, 5));
        // System.out.println(optimizedpower(a, n));
        // System.out.println(tillingProblem(5));
        // String str="appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""),new boolean[26]);
        // System.out.println(friendsPairing(3));
        printBinaryString(3, 0, " ");
        
    }
}
