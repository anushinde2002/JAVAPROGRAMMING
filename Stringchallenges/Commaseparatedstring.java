
//WAP to comma separated string
import java.util.*;

// create class SplitStringExample1 to split string by comma   
class Commaseparatedstring {

  // main() method start
  public static void main(String[] args) {

    String str1, str2;

    // create Scanner class object to take input from user
    Scanner sc = new Scanner(System.in);

    // take input from the user for str1 and str2
    System.out.println("\nEnter String1 to split by comma: ");
    str1 = sc.nextLine();

    System.out.println("\nEnter String2 to split by comma: ");
    str2 = sc.nextLine();

    // use split(regex) and split(regex, limit) methods
    String[] str1Array = str1.split(", ");

    String[] str2Array = str2.split(", ", 3);

    // use for loop to print each elements of the arrays
    System.out.println("\nElements after break " + str1 + ":");

    for (int i = 0; i < str1Array.length; i++) {
      System.out.println((i + 1) + " element: " + str1Array[i]);
    }

    System.out.println("\nElements after break " + str2 + ":");
    for (int i = 0; i < str2Array.length; i++) {
      System.out.println((i + 1) + " element: " + str2Array[i]);
    }
  }
}