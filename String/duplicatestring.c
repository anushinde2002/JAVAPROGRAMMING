#include <stdio.h>
#include <string.h>

void findDuplicates(char *str) {
    int count[256] = {0}; // Assuming ASCII characters

    // Count the frequency of each character
    for (int i = 0; str[i]; i++) {
        count[(unsigned char)str[i]]++;
    }

    // Print characters with frequency greater than 1
    printf("Duplicate characters in the string are:\n");
    for (int i = 0; i < 256; i++) {
        if (count[i] > 1) {
            printf("%c: %d times\n", i, count[i]);
        }
    }
}

int main() {
    char str[] = "example string with duplicates";
    findDuplicates(str);
    return 0;
}
