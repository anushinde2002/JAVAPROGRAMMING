
import java.util.Arrays;

public class KthElementArray {
    public static void main(String[] args) {
        // Define an array of integers
        int[] array = { 15, 22, 3, 40, 8, 7, 50, 1 };

        // Define the value of k
        int k = 3;

        // Find kth smallest and largest elements
        findKthSmallestAndLargest(array, k);
    }

    public static void findKthSmallestAndLargest(int[] array, int k) {
        if (k <= 0 || k > array.length) {
            System.out.println("Invalid value of k: " + k);
            return;
        }

        // Sort the array
        Arrays.sort(array);

        // Print the sorted array (optional, for verification)
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Find kth smallest and kth largest elements
        int kthSmallest = array[k - 1];
        int kthLargest = array[array.length - k];

        // Print the results
        System.out.println(k + "th smallest value: " + kthSmallest);
        System.out.println(k + "th largest value: " + kthLargest);
    }
}
