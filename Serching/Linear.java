package Serching;

public class Linear {
    public static void main(String[] args) {
        int[] arr = {12,34,35,67,86,46};
        int target = 186;
       int index = linearSearch(arr, target);
       System.out.println(index);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i; 
        }

        return -1;
    }
}
