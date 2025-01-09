package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // While loop
        // int a =1;
        // while (a<=10) {
        // System.out.println(a);
        // a++;
        // }

        // Sum of n natural numbers
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int a=1;
        // int sum =0;
        // while (a<=n) {
        // sum=sum +a;
        // a++;
        // }
        // System.out.println(sum);

        // for loop

        // for (int i = 1; i <= 5; i++) {
        // System.err.println("****");
        // }

        // int n=10899;
        // while (n>0) {
        // int lastDigit =n%10;
        // System.err.print(lastDigit);
        // n=n/10;
        // }

        // int rev=0;
        // int n=10899;
        // while (n>0) {
        // int lastDigit=n%10;
        // rev = (rev*10)+lastDigit;
        // n=n/10;
        // }
        // System.out.println(rev);
        // }

        // int count=1;
        // do{
        // System.out.println("Hel1o");
        // count++;
        // if(count==3){
        // break;
        // }
        // }while(count<5);

        // keep enetering numbers till user enters a mutiple of 10

        // Scanner sc=new Scanner(System.in);
        // do {
        // System.out.println("Enter your number:");
        // int num =sc.nextInt();
        // if(num%10==0){
        // continue;
        // }
        // System.out.println(num);

        // } while (true);

        // for (int i = 1; i <= 5; i++) {
        // if(i==3){
        // continue;
        // }
        // System.out.println(i);

        // }

        // prime :2,3,5,7,11

        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // if (n==2) {
        // System.out.println("n is prime");
        // } else {
        // boolean isPrime =true;
        // for (int i = 2; i <Math.sqrt(n) ; i++) {
        // if(n% i==0){
        // isPrime=false;
        // }
        // }

        // if (isPrime==true) {
        // System.out.println("n is prime");
        // }else{
        // System.out.println("n is not prime ");
        // }
        // }


        // Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        // Scanner sc=new Scanner(System.in);
        // int choice;
        // int sumeven=0;
        // int sumodd=0;

        // do {
        //     System.out.println("Enter a number:");
        //     int num=sc.nextInt();
        //     if(num%2==0){
        //         sumeven=sumeven+num;
        //     }else{
        //         sumodd=sumodd+num;
        //     }
        //     System.out.println("if you want do the task again Enter  the number press 1 for yes or 0 for no  ");
        //     choice=sc.nextInt();
        // } while (choice==1);
        // System.out.println("Sum of the Even number" +  sumeven);
        // System.out.println("Sum of the Even number" + sumodd);
        // int i=0,j=10;
        // while (i<j) {
        //     System.out.println(i +","+ j);
        //     i++;
        //     j--;
        // }

      //    Q3.factorial
        // Scanner sc =new Scanner(System.in);
        // int num=sc.nextInt();
        // int fact=1;
        // for (int i = 1; i <= num; i++) {
        //     fact*=i;
        // }
        // System.out.println(fact);


        // Q4. mutliplication 
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter the number :");
        // int num=sc.nextInt();
        // for(int i=1;i<=10;i++){
        //     System.err.println(num +" * " + i + " = " + num* i);
        // }

        // Q5.
        // int i;
        // for( i=0;i<=5;i++ ) {
        //     System.out.println("i = " + i);
        // }
        // System.out.println("i after the loop = " + i);
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        int a=1,b=1;
        for (int i = 3; i <=num; i++) {
        int temp =a;
        a=b;
        b=temp+b;
        System.out.println(a);
        }
    }
}
