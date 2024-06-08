public class PrimeElements {
  public static void main(String[] args) {
    int[] array = { 10, 15, 17, 19, 23, 24, 29, 35, 37 };

    // Call the method to find prime elements
    int[] primeElements = findPrimeElements(array);

    // Print the prime elements
    System.out.print("Prime elements in the array: ");
    for (int element : primeElements) {
      System.out.print(element + " ");
    }
  }

  public static int[] findPrimeElements(int[] array) {
    // Use a dynamic list to store prime numbers
    java.util.List<Integer> primeList = new java.util.ArrayList<>();

    for (int element : array) {
      if (isPrime(element)) {
        primeList.add(element);
      }
    }

    // Convert the list to an array
    int[] primeArray = new int[primeList.size()];
    for (int i = 0; i < primeList.size(); i++) {
      primeArray[i] = primeList.get(i);
    }

    return primeArray;
  }

  public static boolean isPrime(int number) {
    if (number <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
