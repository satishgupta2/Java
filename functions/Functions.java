// package Functions;

import java.util.Scanner;

public class Functions {
    // public static void Helloworld(){
    //     System.out.println("Hello World!");
    // }

    // public static void printSum(int a,int b){
    //     int sum=a+b;
    //     System.out.println(sum);
    // }

    // public static void swap(int a,int b){
    //     //swap
    //     int temp=a;
    //     a=b;
    //     b=temp;

    //     System.out.println(a);
    //     System.out.println(b);
    // }


    //Find the product of a & b
    // public static int Product(int a,int b){
    //     int mul=a*b;
    //     return mul;
    // }

    // Factorial
    // public static int factorial(int n){
    //     int fact=1;
    //     for(int i=1;i<=n;i++){
    //         fact=fact*i;
    //     }
    //     return fact;
    // }

    // binomial
    // public static int binCoeff(int n,int r){
    //     int fact_n=factorial(n);
    //     int fact_r=factorial(r);
    //     int fact_nmar=factorial(n-r);

    //     int binominal_c0eff=fact_n/(fact_r * fact_nmar);
    //     return binominal_c0eff;
    // }


    //method overloading
    // public static float sum(float a,float b){
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    // Prime number
    // public static boolean isPrime(int n){
    //     // boolean isPrime=true;
    //     for (int i = 2; i <=n-1; i++) {
    //         if(n%2==0){
    //         //    isPrime=false; 
    //            return false;
    //         }
    //     }
    //     return true;
    // }



    // public static void Primeinrnge(int n){
    //     for (int i = 2; i <=n; i++) {
    //         if(isPrime(i)){  
    //             System.out.print(i+ " ");
    //         }
            
    //     }
    //     System.out.println();



    //binary to demical
    // public static void binTo(int binNum){
    //     int myNum=binNum;
    //     int pow=0;
    //     int decNum=0;

    //     while (binNum>0) {
    //         int lastDigit=binNum %10;
    //         decNum=decNum+ (lastDigit*(int) Math.pow(2, pow));
    //         pow++;
    //         binNum=binNum/10;
    //     }
    //     System.out.println("decimal of " +myNum + " = " + decNum);
    // }
    public static void decToBin(int n){
        int myNum=n;
        int pow=0;
        int binNum=0;

        while (n>0) {
            int rem=n%2;
            binNum=binNum + (rem*(int) Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of " + myNum + " = " +binNum);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // printSum(a,b);

        // int a=5;
        // int b=10;
        // swap(a,b);

        // int Multi=Product(5,10);
        // System.out.println(Multi);
        // Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt();
        // int fact=factorial(num);
        // System.out.println(fact);
        // System.out.println(binCoeff(5, 2));
        // System.out.println(sum(4.6f,5.55f));
        // System.out.println(sum(5, 10, 50));
        // System.out.println(isPrime(4));
        // Primeinrnge(20);
        // decToBin(5);

    }
}
