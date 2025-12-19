/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void mergeSort(int arr[], int left, int right){
        if(left >= right){
            return;
        }
            int mid = left + (right-left)/2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            
            merge(arr, left, mid, right);
        
    }
    
    public static void merge(int[] arr, int left, int mid, int right){
        int[] temp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k=0;
        while(i<=mid && j<=right){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=right){
            temp[k++] = arr[j++];
        }
        
        for(int i2=0, j2=left; i2<temp.length; i2++, j2++){
            arr[j2] = temp[i2];
        }
        
    }
    
	public static void main(String[] args) {
		int[] arr = {12, 30, 16, 9, 14, 29,37};
		mergeSort(arr,0, arr.length-1);
		System.out.print("Sorted arr:"+Arrays.toString(arr));
	}
}