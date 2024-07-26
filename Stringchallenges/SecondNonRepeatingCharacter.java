
//WAP to find second nonrepeating character from the string
import java.util.HashMap;
import java.util.Map;

public class SecondNonRepeatingCharacter {

    public static char findSecondNonRepeatingChar(String str) {
        // Create a map to store character frequency
        Map<Character, Integer> charCount = new HashMap<>();

        // Traverse through the string to build the character frequency map
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Traverse the string again to find the second non-repeating character
        boolean foundFirstNonRepeating = false;
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) { // Found a non-repeating character
                if (foundFirstNonRepeating) {
                    return c; // Second non-repeating character found
                } else {
                    foundFirstNonRepeating = true;
                }
            }
        }

        // If no second non-repeating character found, return a default value
        return '\0'; // '\0' indicates no valid character found
    }

    public static void main(String[] args) {
        String str = "aakbbccddeeffgghhii";
        char secondNonRepeating = findSecondNonRepeatingChar(str);

        if (secondNonRepeating != '\0') {
            System.out.println("Second non-repeating character: " + secondNonRepeating);
        } else {
            System.out.println("No second non-repeating character found.");
        }
    }
}
