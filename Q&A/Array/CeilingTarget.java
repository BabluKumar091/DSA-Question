package Array;

import java.util.Arrays;

public class CeilingTarget {
    public static void main(String[] args) {
        int[] arr = { 12, 23, 25, 45, 56, 67,69 };
     
        int target = 24;
        int index = ceiling(arr, target);
        System.out.println(index);

    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

}
