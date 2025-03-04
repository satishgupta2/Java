public class PracticeQ {

    public static void merge(String arr[],int start,int end){
        int sz=(end-start+1),mid=(start+end/2);
        System.out.println("start:"+start +"end:" +end + "mid:" + mid + "sz:");
        String sortedArr[]=new String[sz];

        int i=start,j=mid+1, index=0;
        while (i<=mid && j<=end) {
            if (arr[i].compareTo(arr[j])<0) {
                // arr[i]<arr[j]
                sortedArr[index++]=arr[i++];
            }else{
                sortedArr[index++]=arr[j++];
            }
        }
        while (i<=mid) {
            sortedArr[index++]=arr[i++];
        }
        while (j<=end) {
            sortedArr[index++]=arr[j++];
        }

        // copy from sortedArr to the original arr
        // j=start;
        for ( i = 0; i <= sz; i++) {
            // arr[j++]=sortedArr[i];
            arr[start+i]=sortedArr[i];
        }
    }

    public static void mergeSort(String arr[],int start,int end){
        if (start >=end) {
            // Either my array has 0 elements
            // or it has only 1 elments
            // In both the cases my array is already sorted 
            // Don't do anything -simply return 
            return;
        }
            int mid=(start+end)/2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);

            merge(arr, start, end);
    }

    public static void printArray(String arr[]){
        for(String s:arr){
            System.out.println(s + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String arr[]= {"sun","earth","mars","mercury"};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
        
    }
}
