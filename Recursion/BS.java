package Recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {12, 14, 16, 18, 20, 49, 50};
        System.out.println(binarySearch(arr, 50, 0, arr.length-1));
        
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end- start)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
          return  binarySearch(arr, target, start, mid-1);
        }

        return binarySearch(arr, target, mid+1, end);
    }
    
}


