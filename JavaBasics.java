import java.util.Scanner;
import java.util.*;

public class JavaBasics {
    public static void main(String arsg[]) {
        // int a=25;
        // System.out.println(a);
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // a=50;
        // System.out.println(a);

        // byte b = 8;
        // System.out.println(b);

        // char ch = 'c';
        // System.out.println(ch);

        // boolean var=true;
        // System.out.println(var);

        // float price= 8.45;
        // System.out.println(price);

        // int a =5;
        // int b=5;
        // int sum=a+b;
        // System.out.println(sum);

        // int input=sc.nextInt();
        // System.out.println(input);

        // float price =sc.nextFloat();
        // System.out.println(price);

        // double sat =sc.nextDouble();
        // System.out.println(sat);

        // boolean bol=sc.nextBoolean();
        // System.out.println(bol);

        // long bola=sc.nextLong();
        // System.out.println(bola);

        // int check =sc.nextInt();
        // int check1=sc.nextInt();
        // int sum = check*check1;
        // System.out.println(sum);

        // float r=sc.nextFloat();
        // float Area= 3.14f * r * r;
        // System.out.println(Area);

        // float a=sc.nextInt();
        // System.out.println(a);
        // float a=2.54f;
        // int b=(int)a;
        // System.out.println(b);

        // char f='c';
        // char s='a';
        // System.out.println(f-s);

        // Q1.
        // Scanner sc =new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // int sum=a +b+c;
        // int avg=sum/3;
        // System.out.println(avg);

        // Q2.Area of a sqaure
        // Scanner sc =new Scanner(System.in);
        // int side=sc.nextInt();
        // int area=side*side;
        // System.out.println(area);

        // Q3
        // Scanner sc=new Scanner(System.in);
        // float pencil=sc.nextFloat();
        // float pen=sc.nextFloat();
        // float eraser=sc.nextFloat();
        // float total=pencil+pen+eraser;
        // // System.out.println("Bill is:" +total);

        // //Addon GST
        // float newToatal=total +(0.18f *total);
        // System.err.println("Your toatal bill is:" +newToatal);

        // byte b=4;
        // char c='a';
        // short s=512;
        // int i=1000;
        // float f=3.14f;
        // double d=99.9954;

        // double result=(f*b)+ (i%c)-(d*s);
        // System.out.println(result);

        // int $=24;
        // System.out.println($);

        // System.out.println("Add=" + (A+B) );
        // System.out.println("sub=" + (A-B) );
        // System.out.println("mul=" + (A*B) );
        // System.out.println("sub=" + (A/B) );
        // System.out.println("mod=" + (A%B) );

        // int A=100;
        // int B=65;
        // int C=101;
        // System.out.println(!(A>B));
        // System.out.println(B);

        // int x = 2, y = 5;
        // int exp1 = (x * y / x);
        // int exp2 = (x * (y / x));
        // System.out.print(exp1 + ",");
        // System.out.print(exp2);

        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){
        // System.out.println("Hello");
        // }
        // if(z > y && z < x){System.out.println("Java");
        // }if((y+200) < x && (y+150) < z)
        // {System.out.println("Hello Java");}

        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z);

        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;
        // int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b *
        // y);
        // System.out.println(exp);
        // int age=17;
        // if (age>=18) {
        // System.out.println("You can vote");
        // } else {
        // System.out.println("You cannot vote");
        // }

        // int a=10;
        // int b=3;
        // if (a>=b) {
        // System.out.println("A is a greater number");
        // } else {
        // System.out.println("B is a greater number");
        // }
        // Scanner sc =new Scanner(System.in);
        // int num =sc.nextInt();
        // if(num%2==0){
        // System.out.println("number is even");
        // }else{
        // System.out.println("number is odd");
        // }

        // Tax Calculator
        // Scanner sc = new Scanner(System.in);
        // int tax;
        // int income =sc.nextInt();
        // if(income<=500000){
        // tax=0;
        // }else if(income>=50000 && income<=1000000){
        // tax=(int)(income* 0.2);
        // // System.out.println("20% tax :" + tax);
        // }else{
        // tax=(int)(income* 0.3);
        // }

        // System.out.println("30% tax :"+ tax);

        // la
        // int A=6,B=3,C=1;
        // if(A>=B && A>=C){
        // System.out.println("A is a largest");
        // }else if (B>=C) {
        // System.out.println("B is a largest ");
        // }
        // else{
        // System.out.println("C is a largest");
        // }

        // Ternary
        // String lag=(num%2==0) ? "even" : "Odd";
        // System.out.println(lag);
        // int num=4;

        // int marks=32;
        // String res=(marks>=33)? "Pass" :"Fail";
        // System.out.println(res);

        // int number=2;
        // switch(number){
        // case 1:System.out.println("Samosa");
        // case 2:System.out.println("Burger");
        // break;
        // case 3:System.out.println("Mongo shake");
        // default :System.err.println("your are dreaming");
        // }

        // number is positive or negative
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter a number");
        // int x=sc.nextInt();
        // if(x>=0){
        // System.out.println("number is positive");
        // }else{
        // System.out.println("number is negative");
        // }

        //

        // double temp=99.99;
        // if(temp>=100){
        // System.out.println("you have a fever");
        // }else{
        // System.out.println("you don't have fever");
        // }

        // week number day between 1 to 7
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a weekdays");
        // int weekdays = sc.nextInt();
        // switch (weekdays) {
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuseday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thuraday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // System.out.println("Invalid input please week number between 1 to 7");
        // }

        // Q4
        // int a=63,b=36;
        // boolean x= (a<b)?true:false;
        // int y= (a>b)?a:b;
        // System.out.println(x);
        // System.out.println(y);

        // Q5 leap year or not
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Year");
        // int year =sc.nextInt();
        // if(year%400 ==0 ){
        // System.err.println("this is a leap year");
        // }else if(year% 4==0 && year%100 !=0 ){
        // System.err.println("this is a leap year");
        // }else{
        // System.err.println("It is not a leap year");
        // }

        // Given the number of the month your task is to calculate the number of days
        // present in the particular month.
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Month");
        int month = sc.nextInt();
        if (month == 2) {
            System.out.println("Febaruary have 28 days");
        } else if (month < 8) {
            if (month % 2 == 0) {
                System.out.println("30 days");
            } else {
                System.err.println("31 days");
            }
        }else{
            if (month % 2 == 0) {
                System.out.println("31 days");
            } else {
                System.err.println("30 days");
            }
        }
    }
}
