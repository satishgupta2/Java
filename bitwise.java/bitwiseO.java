
public class bitwiseO {

    public static void oddOrEvent(int n){
        int bitsMask=1;
        if((n & bitsMask)==0){
            // even number
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    // public static int pdateIthbit(int n ,int i , int newBit){
    //     if(newBit==0){
    //         return 
    //     }
    // }
    public static void main(String[] args) {

        // oddOrEvent(6);

        // System.out.println(5>>2);
    }
}
