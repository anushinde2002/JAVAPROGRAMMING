public class EvenOddArrayOperations {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6 };

    // Calculate factorials of even elements
    System.out.println("Factorials of even elements:");
    for (int element : array) {
      if (element % 2 == 0) {
        System.out.println("Factorial of " + element + " is " + factorial(element));
      }
    }

    // Print multiplication tables of odd elements
    System.out.println("\nMultiplication tables of odd elements:");
    for (int element : array) {
      if (element % 2 != 0) {
        System.out.println("Multiplication table of " + element + ":");
        printMultiplicationTable(element);
      }
    }
  }

  public static long factorial(int n) {
    if (n == 0) {
      return 1;
    }
    long fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void printMultiplicationTable(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " x " + i + " = " + (n * i));
    }
    System.out.println(); // Print an empty line for better readability
  }
}
