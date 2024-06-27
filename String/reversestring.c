#include <stdio.h>
#include <string.h>

// Function to reverse the string
void reverseString(char *str) {
    int length = strlen(str);
    int start = 0;
    int end = length - 1;
    char temp;

    // Swap characters from start to end
    while (start < end) {
        // Swap the characters
        temp = str[start];
        str[start] = str[end];
        str[end] = temp;

        // Move towards the middle
        start++;
        end--;
    }
}

int main() {
    char str[] = "Hello, World!";

    printf("Original string: %s\n", str);

    // Reverse the string
    reverseString(str);

    printf("Reversed string: %s\n", str);

    return 0;
}
