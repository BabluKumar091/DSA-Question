package Array;


import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
         int[][] arr = new int[3][4];
         System.out.println(arr.length);

//         int arr2D[][] = {
//             {1,2,3},
//             {1,2},
//             {1,2,3}
//         };

//         System.out.println(arr2D[2][2]);



        //  ++++++++++++++input from user+++++++++

        // for(int i=0; i<3; i++){
        //     for (int j = 0; j <3; j++) {
        //         arr[i][j] = sc.nextInt();
        //     }
        // }

        System.out.println(arr[0][3]);
     }
}
