package Loops;

public class AdvancedP {
    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // Rotated(7);
        // inverted_pyramid(5);
        // Floyd_triangle(5);
        // zero_one_triangle(5);
        // Butterfly(8);
    }

    // Butterfly pattern
    // public static void Butterfly(int n) {
    //     // 1 half
    //     // outer loop for star
    //     for (int i = 1; i <= n; i++) {
    //         // stars
    //         for (int i1 = 1; i1 <= i; i1++){
    //         System.out.print("*");
    //         }
    //         for (int j = 1; j <= 2 * (n - i); j++) {
    //             // spaces
    //             System.out.print(" ");
    //         }
    //             for (int j2 = 1; j2 <= i; j2++) {
    //                 // stars i
    //                 System.out.print("*");
    //             }
    //         System.out.println();
    //     }
    //         // 2 nd
    //         for (int i = n; i >= 1; i--) {
    //             // stars
    //             for (int i1 = 1; i1 <= i; i1++){
    //                 System.out.print("*");
    //             }
    //             for (int j = 1; j <= 2 * (n - i); j++) {
    //                 // spaces
    //                 System.out.print(" ");
    //             }
    //                 for (int j2 = 1; j2 <= i; j2++) {
    //                     // stars i
    //                     System.out.print("*");
    //                 }
    //                 System.out.println();
    //             }
    // }

    // O-1 triangle pattern
    // public static void zero_one_triangle(int n){
    // for (int i = 1; i <=n; i++) {
    // for (int j = 1; j <=i; j++) {
    // int sum=i+j;
    // if(sum % 2==0){
    // // even
    // System.out.print("1 ");
    // }else{
    // // odd
    // System.out.print("0 ");
    // }

    // }
    // System.out.println();
    // }
    // }

    // Floyd triangle
    // public static void Floyd_triangle(int n){
    // int count=1;
    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <=i; j++) {
    // System.out.print(count+" ");
    // count++;
    // }
    // System.out.println();
    // }
    // }

    // inverted half
    // public static void inverted_pyramid(int n){
    // // outer of line row
    // for (int i = 1; i <=n; i++) {
    // for (int j = 1; j <=n-i+1; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }
    // }

    // // rotated half pyramid
    // public static void Rotated (int n){
    // for (int i = 1; i <=n; i++) {
    // for (int j = 1; j <=n-i; j++) {
    // System.err.print(" ");
    // }
    // for (int j = 1; j <=i; j++) {
    // // Star
    // System.out.print("*");
    // }
    // System.out.println();
    // }
    // }

    // public static void hollow_rectangle(int toRows,int totCols){

    // outer loops
    // for (int i = 1; i <=toRows; i++) {
    // // inner loops cols colums
    // for(int j=1;j<=totCols;j++ ){
    // // cell -(i,j)
    // if (i == 1 || i == toRows || j == 1 || j == totCols) {
    // // boundary cells
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }
    // }
}
