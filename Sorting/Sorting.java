package Sorting;

// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;

public class Sorting {
    // BubbleSort
    // public static void bubbleSort(int arr[]){
    //     for (int turn = 0; turn < arr.length; turn++) {
    //         for (int j = 0; j < arr.length-1-turn; j++) {
    //             if(arr[j] < arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
            
    //     }
    // }

    // Slection Sort
    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) { //3,6,2,1,8,7,4,5,3,1
                if(arr[smallest] < arr[j]){
                    smallest=j;
                }
            }
            // swap
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }


    // insertionsort
    // public static void InsertSort(int arr[]){
    //     for (int i = 1; i < arr.length; i++) {
    //         int curr=arr[i];
    //         int prev=i-1;
    //         // finding out the correct position to insert
    //         while (prev >=0 && arr[prev] > curr) {
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         // insertion
    //         arr[prev+1]=curr;
    //     }
    // }

    // Counting sort
    // public static void countingSort(int arr[]){
    //     int largest=Integer.MIN_VALUE;
    //     for (int i = 0; i < arr.length; i++) {
    //         largest=Math.max(largest, arr[i]);
    //     }
    //     int count[]=new int[largest+1];
    //     for (int i = 0; i < arr.length; i++) {
    //         count[arr[i]]++;
    //     }

    //     // sorting
    //     int j=0;
    //     for (int i = 0; i < count.length; i++) {
    //         while (count[i]>0) {
    //             arr[j]=i;
    //             j++;
    //             count[i]--;

    //         }
    //     }
    // }

    // new soretd array display
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        // Arrays.sort(arr,Collections.reverseOrder());
        // bubbleSort(arr);
        selectionSort(arr);
        // InsertSort(arr);
        // countingSort(arr);
        printArr(arr);
    }
}
