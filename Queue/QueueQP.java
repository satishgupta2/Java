import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class QueueQP {
    // Function to generate binary numbers from 1 to n
    // using queue data structure
    static void generatePrintQueue(int n){
        Queue<String> q=new LinkedList<String>();
        q.add("1");
        while (n-->0) {
            String s1=q.peek();
            q.remove();
            System.out.print(s1 + " ");
            String s2=s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    // max
// imum of all subarrays of size k
    static void printMax(int arr[], int n, int k) {
        // Create a Double Ended Queue, Qi that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values from front to rear in Qi, i.e., arr[Qi.front()]
        // to arr[Qi.rear()] are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<>();

        // Process first k (or first window) elements of array
        int i;
        for (i = 0; i < k; i++) {
            // For every element, the previous smaller elements are useless so remove them
            while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast(); // Remove from rear
            }
            // Add new element at rear of queue
            Qi.addLast(i);
        }

        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for (; i < n; i++) {
            // The element at the front of the queue is the largest element of previous window,
            // so print it
            System.out.print(arr[Qi.peek()] + " ");

            // Remove the elements which are out of this window
            while ((!Qi.isEmpty()) && Qi.peek() <= i - k) {
                Qi.removeFirst(); // Remove from front of queue
            }

            // Remove all elements smaller than the currently being added element (remove useless elements)
            while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) {
                Qi.removeLast();
            }

            // Add current element at the rear of Qi
            Qi.addLast(i);
        }

        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }

    public static void main(String[] args) {
        // int n=5;
        // generatePrintQueue(n);

        int arr[]={12,1,78,90,57,89,56};
        int k=3;
        printMax(arr,arr.length, k);
    }
}
