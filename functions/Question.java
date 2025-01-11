import java.util.Scanner;

public class Question {

    // Q1.verage of three number
    // public static int Average(int a,int b, int c){
    //     int sum=a+b+c;
    //     int avg =sum/3;
    //     return  avg;
    // }

    
    public static void main(String[] args) {
        // System.out.println(Average(20, 20, 20));
        
        // System.out.println(isEven(a));
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int ans=sumofdigits(num);
    System.out.println("Sum of digits : " +ans);


    }

    // Q2.sumofdigits
    public static int sumofdigits(int n){
        int sumofdigit=0;
        while (n>0) {
            
            int lastDigit=n%10;
            sumofdigit=sumofdigit+lastDigit;
            n=n/10;
        }
        return sumofdigit;
    }


// Q3.palindrome
// public static boolean palindrome(int n){
//     int input=n;
//    int rev=0;

//    while (input!=0) {
//        int lastDigit=input%10;
//        input=input/10;
//        rev=rev*10+lastDigit;
//    }
//    if(rev==n){
//     return true;
//    }else{
//     return false;
//    }
// }

    // Q2.method namedd isEven
    // public static boolean isEven(int n){
    //     boolean isEven=false;
    //     if(n%2==0){
    //         isEven=true;
    //     }
    //     return isEven;
    // }

}
