package DivideConquer;

public class RotatedSor {
    public static int serch(int arr[],int tar,int si,int ei){
        if (si >ei) {
            return -1;
        }
        //kaam 
        int mid=(si+ei)/2;


        // case found
        if (arr[mid]==tar) {
            return mid;
        }


        // mid on L1
        if (arr[si]<=arr[mid]) {
            
            // case a:left
            if (arr[si]<=tar && tar<=arr[mid]) {
             return   serch(arr, tar, si, mid-1);
                
            }else{
                // case b:right
              return  serch(arr, tar, mid+1, ei);
            }
        }
        // mid on L2
        else{
            // case c:right
            if (arr[mid]<=tar && tar<=arr[ei]) {
                return serch(arr, tar, mid+1,ei);
            }else{
                // case d:left
                return serch(arr, tar, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int key=0;
        int idx=serch(arr, key, 0, arr.length-1);
        System.out.println(idx);

        }
}
