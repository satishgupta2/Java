 package Arrays;

import java.util.Scanner;

public class Arrays {

    // String linearSearch
    // public static int linearSerach(String menu[],String key){
    //     for (int i = 0; i < menu.length; i++) {
    //         if(menu[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int linearSerach(int numbers[],int key){
    //     for (int i = 0; i < numbers.length; i++) {
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void update(int marks[]){
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i]++;
    //     }
    // }


    // largest & smallest
    // public static int getlargest(int numbers[]){
    //     int largest=Integer.MIN_VALUE; //infinity
    //     int smallest =Integer.MAX_VALUE;
    //     for (int i = 0; i < numbers.length; i++) {
    //         if(largest<numbers[i]){  
    //             largest=numbers[i];
    //         }
    //         if (smallest >numbers[i]) {
    //             smallest=numbers[i];
    //         }
    //     }
    //     System.out.println("smallest value is:"+smallest);
    //     return largest;
    // }

    public static int Binary_Search(int numbers[],int key ){
        int start=0,end=numbers.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            // comparisons
            // found
            if(numbers[mid]==key){
                return mid;
            }
            // left
            if(numbers[mid]< key){
                start=mid+1; 
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Binary search 
        int numbers[]={2,4,6,8,10,12,14};
        int key=10;
        System.out.println("Index for key is:"+ Binary_Search(numbers,key));
         
         // find the largest number in a given array
        // int numbers[]={1,2,6,3,5};
        // System.out.println("largest value is "+getlargest(numbers) );

        
        // int numbers[]={2,4,6,8,10,12,14,16};
        // int key=20;
        // int Index=linearSerach(numbers, key);
        // String menu[]={"samosa"," fruits","Vada Pav","chole"};
        // String key="samosa";
        // int Index=linearSerach(menu, key);
        // if(Index==-1){
        //     System.out.println("Not Found");
        // }else{

        //     System.out.println("key Index at :" +Index);
        // }





        // int marks[]={97,98,99};
        // update(marks);

        // // print our marks
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.print(marks[i] + " ");
        // }

        // System.out.println();
        // int marks[]=new int [50];
        // int numbers[]={1,2,3};
        // int marks[]=new int [50];
        // Scanner sc=new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();

        // System.out.println("math :" +marks[0]);
        // System.out.println("phy :" +marks[1]);
        // System.out.println("chem :" +marks[2]);

        // int percentage=(marks[0]+marks[1]+marks[2])/3;
        // System.out.println(marks.length);
    }
    
}