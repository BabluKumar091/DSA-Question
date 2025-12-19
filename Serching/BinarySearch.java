package Serching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {12, 34, 35, 24, 56, 9};
        Arrays.sort(arr);
        int target = 24;
        int index = binarySearch(arr, target);
        System.out.println(index);
       
    }
   static int binarySearch(int[] arr, int target){
    int start = 0;
    int end = arr.length-1;

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
