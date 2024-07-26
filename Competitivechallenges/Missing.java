
public class Missing {
  public static void main(String[] args) {
    // Example array with a missing number from 1 to 10
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 10 };

    // Call the method to find the missing number
    int missingNumber = findMissingNumber(array);

    // Print the result
    System.out.println("The missing number is: " + missingNumber);
  }

  public static int findMissingNumber(int[] array) {
    int n = 10;
    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;

    // Calculate the sum of the elements in the array
    for (int value : array) {
      actualSum += value;
    }

    // The missing number is the difference between the expected sum and the actual
    // sum
    return expectedSum - actualSum;
  }
}
