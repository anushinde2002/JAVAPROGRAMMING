public class MaxAndSecondMax {
    public static void main(String[] args) {
        int[] array = { 10, 20, 4, 45, 99, 67 };

        // Check if array has at least two elements
        if (array.length < 2) {
            System.out.println("Array needs to have at least two elements");
            return;
        }

        // Initialize max and second max
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }

        // Handle the case where there is no second max
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second maximum element");
        } else {
            System.out.println("Maximum element is: " + max);
            System.out.println("Second maximum element is: " + secondMax);
        }
    }
}
