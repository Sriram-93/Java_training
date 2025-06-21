import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.add(num); 
            if (minHeap.size() > k) minHeap.remove(); 
        }

        System.out.println("K-th largest element is: " + minHeap.peek()); 
        sc.close();
    }
}
