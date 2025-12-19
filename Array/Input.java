package Array;
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // primitive data type
        int[] arr = new int[4];
        // arr[0] = 1;
        // arr[1]= 2;
        // arr[2] = 3;
        // arr[3]= 4;
        // System.out.println(arr[0]);

        // input using for loop

        // for(int i=0; i<4; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println(arr[3]);
        // for(int num: arr){
        //     System.out.print(num+ " ");
        // }

        // for nonPrimitive Datatype
        String[] arr2 = new String[5];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr2));

    }
}
