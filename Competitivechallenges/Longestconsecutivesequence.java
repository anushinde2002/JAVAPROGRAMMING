//WAP to find the length of longest consecutive sequence in array of integers.

import java.util.HashSet;

public class Longestconsecutivesequence {
  public static void main(String[] args) {
    // Example array of integers
    int[] nums = { 100, 4, 200, 1, 3, 2 };

    // Call the method to find the length of the longest consecutive sequence
    int longestSequenceLength = longestConsecutive(nums);

    // Print the result
    System.out.println("Length of longest consecutive sequence: " + longestSequenceLength);
  }

  public static int longestConsecutive(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    HashSet<Integer> numSet = new HashSet<>();
    for (int num : nums) {
      numSet.add(num);
    }

    int maxLength = 0;

    for (int num : nums) {
      if (!numSet.contains(num - 1)) { // Check if num is the start of a sequence
        int currentNum = num;
        int currentLength = 1;

        while (numSet.contains(currentNum + 1)) {
          currentNum++;
          currentLength++;
        }

        maxLength = Math.max(maxLength, currentLength);
      }
    }

    return maxLength;
  }
}
