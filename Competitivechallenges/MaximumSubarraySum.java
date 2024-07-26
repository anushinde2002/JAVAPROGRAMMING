// How to find subarray with maximum sum in an array of positive and negative number?
public class MaximumSubarraySum {
    public static void main(String[] args) {
        // Example array with positive and negative numbers
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        // Call the method to find the maximum subarray sum
        int maxSubarraySum = maxSubArray(nums);

        // Print the result
        System.out.println("Maximum subarray sum is: " + maxSubarraySum);
    }

    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
}
