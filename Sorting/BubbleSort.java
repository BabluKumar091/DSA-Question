import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {45, 12, 50, 18, 48, 5, 16, 70};
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparison
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, array is already sorted
            if (!swapped) break;
        }
    }
}
