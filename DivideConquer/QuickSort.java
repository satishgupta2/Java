package DivideConquer;


public class QuickSort {

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }


    public static void QuickSort(int arr[],int si,int ei){

        // last elemnt
       int idx= partition(arr,si,ei);
       QuickSort(arr,si,idx-1);
       QuickSort(arr,idx+1,idx-1);


    }

    public static int partition(int arr[],int si,int ei){
        int pivot =arr[ei];
        int i=si-1;

        for (int j = si; j <ei; j++) {
            if (arr[i]<=pivot) {
                i++;
                // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,5};
        QuickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
