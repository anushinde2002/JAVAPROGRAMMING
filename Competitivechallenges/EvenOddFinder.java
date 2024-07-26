import java.util.ArrayList;

public class EvenOddFinder {
  public static void main(String[] args) {
    // Example array of integer values
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    // Call the method to find even and odd integers
    findEvenAndOdd(array);
  }

  public static void findEvenAndOdd(int[] array) {
    // Create lists to store even and odd values
    ArrayList<Integer> evenNumbers = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();

    // Iterate over the array
    for (int value : array) {
      // Check if the number is even or odd
      if (value % 2 == 0) {
        evenNumbers.add(value);
      } else {
        oddNumbers.add(value);
      }
    }

    // Print the even and odd numbers
    System.out.println("Even numbers: " + evenNumbers);
    System.out.println("Odd numbers: " + oddNumbers);
  }
}
