package Loops;

public class newPattern {
    public static void main(String[] args) {
        // solid_rhombhus(5);
        // hollow_Rhombhu(5);
        // Diamond(7);
        Number_Pyramid(5);
    }

// palindromic pattern Number
    public static void Number_Pyramid(int n){
        for (int i =1 ; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    // public static void Number_Pyramid(int n){
    //     for (int i = 1; i <=n; i++) {
    //         for (int j = 1; j <=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //         // int count=1;
    //         for (int j = 1; j <=i; j++) {
    //             // System.out.print(count);
    //             System.out.print(i + " ");
    //             // count=count+1;
    //             }
    //             System.out.println();
    //     }
    // }

    // Diamond
    // public static void Diamond(int n){
    //     // outer
    //     for (int i = 1; i <=n; i++) {
    //         for (int j = 1; j <=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <=2*i-1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     for (int i = n; i >=1; i--) {
    //         for (int j = 1; j <=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <=2*i-1; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    // }

    // Solid Rhombhus
    // public static void solid_rhombhus(int n){
    //     // outer loops
    //     for (int i = 1; i <= n; i++) {
    //         // spaces 
    //         for (int j = 1; j <=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 0; j <=n; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }


    // hollow Rhombhus pattern
    // public static void hollow_Rhombhu(int n){
    //     // outer 
    //     for (int i = 1; i <=5; i++) {
    //         for (int j = 1; j <=n-i; j++) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <=n; j++) {
    //             if(i==1 || i==n || j==1 || j==n ){
    //             System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }
}
