public class ArrayPQ {

    // public static void Arrsearch(int arr[][],int key){
    //     int count=0;
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[0].length; j++) {
    //             if(arr[i][j]==key){
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }

    public static void sumArr(int arr[][]){
        int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[1][j];
            }
        System.out.println("sum of second row :"+sum);;
        
    }


    public static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // int arr[][]={ {1,4,9},{11,4,3},{2,2,3} };
        
        // Arrsearch(arr, 7);
        // sumArr(arr);
        int row=2,col=3;
        int [][] matrix={{2,3,7},{5,6,7}};


        // Display originl matrix
        printMatrix(matrix);


        // transpose the matrix
        int [][] transpose =new int [col][row];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j <col; j++) {
                transpose[j][i]=matrix[i][j];
                
            }
        }

        printMatrix(transpose);
    }
}
