import java.util.*;
public class pattern2 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a lenght of pattern: ");
        int len = sc.nextInt();
        for(int i=1; i<=len; i++){
            for(int j=1; j<=len-i; j++){
                System.out.print(" ");
            }
           for(int k=1; k<=i; k++){
            System.out.print("*");
           }
           System.out.println();
        }
     }
}