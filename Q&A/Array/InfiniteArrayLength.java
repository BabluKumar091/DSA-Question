package Array;

public class InfiniteArrayLength {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 170;
        int position = findPosition(arr, target);
        if (position != -1) {
            System.out.println("Element found at index " + position);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int findPosition(int[] arr, int target) {
        int low = 0;
        int high = 1;

        // Expand the range until the target is within the range
        while (arr[high] < target) {
            low = high;
            high = 2 * high;
        }

        // Perform binary search within the found range
        return binarySearch(arr, target, low, high);
    }


    static int binarySearch(int[] arr, int target, int start, int end){
       
        while(start <= end){
            int mid = start + (end-start) /2;
    
            if(target > arr[mid] ){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
}
}
