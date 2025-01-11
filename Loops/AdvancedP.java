package Loops;


public class AdvancedP {
    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
    public static void hollow_rectangle(int toRows,int totCols){

        // outer loops
        for (int i = 1; i <=toRows; i++) {
            // inner loops cols colums
            for(int j=1;j<=totCols;j++ ){
                // cell -(i,j)
                if (i == 1 || i == toRows || j == 1 || j == totCols) {
                    // boundary cells
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
