//package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = scanner.nextLine();

    // Call the method to count characters
    Map<Character, Integer> characterCountMap = countCharacters(input);

    // Print the character counts
    for (Map.Entry<Character, Integer> entry : characterCountMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }

    scanner.close();
  }

  public static Map<Character, Integer> countCharacters(String str) {
    Map<Character, Integer> characterCountMap = new HashMap<>();

    // Iterate through each character in the string
    for (char c : str.toCharArray()) {
      if (characterCountMap.containsKey(c)) {
        characterCountMap.put(c, characterCountMap.get(c) + 1);
      } else {
        characterCountMap.put(c, 1);
      }
    }

    return characterCountMap;
  }
}
