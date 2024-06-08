/*copying arrays */

public class array7 {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 };
        int newArray[] = java.util.Arrays.copyOf(a, a.length);
        System.out.println("Copied array:" + java.util.Arrays.toString(newArray));

    }

}
