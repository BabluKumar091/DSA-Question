package Recursion4;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 9, 4};
        sort(arr, arr.length, 0);
        System.out.println(Arrays.toString(arr));
        
    }

    static void sort(int[] arr, int l , int index){
        if(l==1){
            return ;
        }

        if(index < l-1){
            if(arr[index] > arr[index+1]){
                swap(arr, index, index+1);   
            }
            sort(arr, l, index+1);
        }

        sort(arr, l-1, 0);

    }

    static void swap(int[] arr, int f, int l){
        int temp = arr[f];
        arr[f] = arr[l];
        arr[l] = temp;
    }
}
