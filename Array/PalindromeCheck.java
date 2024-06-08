public class PalindromeCheck {
  public static void main(String[] args) {
    // Example character array
    char[] charArray = { 'r', 'a', 'c', 'e', 'c', 'a', 'r' };

    // Call the method to check if the array is a palindrome
    boolean isPalindrome = isPalindrome(charArray);

    // Print the result
    if (isPalindrome) {
      System.out.println("The character array is a palindrome.");
    } else {
      System.out.println("The character array is not a palindrome.");
    }
  }

  public static boolean isPalindrome(char[] array) {
    int left = 0;
    int right = array.length - 1;

    while (left < right) {
      if (array[left] != array[right]) {
        return false;
      }
      left++;
      right--;
    }

    return true;
  }
}
