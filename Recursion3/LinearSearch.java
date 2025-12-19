package Recursion3;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12, 23, 4, 26, 35};
        System.out.println(check(arr, 0, 35));
        
    }

    static int check(int[] arr, int index, int target){
        if(index > arr.length-1){
            return -1;
        }
        if(target == arr[index]){
            return index;
        }
        else{
            return check(arr, index+1, target);
        }
    }
}
