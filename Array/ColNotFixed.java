package Array;

import java.util.Arrays;

public class ColNotFixed {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {2,4},
            {2,3,4,5,6}
        };

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
}
